package com.star.controller;

import com.star.entity.User;
import com.star.repository.UserRepository;
import com.star.util.ImgPathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by hp on 2017/4/6.
 */
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ImgPathUtil imgPathUtil;

    @RequestMapping(value = {"/login"},method = RequestMethod.GET)
    public String loginPage(Model model){
        model.addAttribute("user",new User());
        return "login";
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("student_id") String student_id,
                        @RequestParam("password") String password, Model model,
                        HttpServletRequest request){
        User user=userRepository.findByStudentIdAndPassword(student_id,password);
        if (user == null)
        {
            model.addAttribute("error","*用户名或密码错误，请重新输入");
            return "redirect:/login";
        }else{
            request.getSession().setAttribute("login_user",user);
            String red_from=(String)request.getSession().getAttribute("red_from");
            if (red_from.equals("help")){
                request.getSession().removeAttribute("red_from");
                return "redirect:/help_center";
            }else if(red_from.equals("method")){
                request.getSession().removeAttribute("red_from");
                return "redirect:/method_share";
            }else {
                model.addAttribute("user", user);
                return "personal";
            }
        }
    }

    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String registPage(Model model){
        model.addAttribute("user",new User());
        model.addAttribute("regist","true");
        return "login";
    }

    @RequestMapping(value = {"/regist"},method = RequestMethod.POST)
    public String regist(User user, Model model,HttpServletRequest request){
        user.setPersonalDesc("这个人很懒，什么都没有留下");
        user.setUserImg("/static/img/touxiang.png");
        User user1=userRepository.save(user);

        model.addAttribute("user",user1);
        request.getSession().setAttribute("login_user",user1);
        return "personal";
    }

    @RequestMapping(value = "/user_shezhi/{id}",method = RequestMethod.GET)
    public String shezhi(@PathVariable("id") int id , Model model){
        model.addAttribute("user",userRepository.findOne(id));
        return "shezhi";
    }

    @RequestMapping(value = "/user_upload",method = RequestMethod.POST)
    public String shezhi(@RequestPart("img") MultipartFile img,User user,
                         Model model,HttpServletRequest request) throws IOException {
        String url=imgPathUtil.saveImgs(request,img,"user");
        user.setUserImg(url);
        userRepository.save(user);
        request.getSession().setAttribute("login_user",user);
        model.addAttribute("id",user.getId());
        return "redirect:/user_shezhi/{id}";
    }

    @RequestMapping(value = "/set_password/{id}",method = RequestMethod.POST)
    public String setPassword(@PathVariable("id") int id, String oldPassword,
                              String newPassword,Model model){
        User user1=userRepository.findOne(id);
        model.addAttribute("id", user1.getId());
        if (user1.getPassword().equals(oldPassword)){
            user1.setPassword(newPassword);
            userRepository.save(user1);
            return "redirect:/login";
        }else {
            return "password_fail";
        }

    }

    @RequestMapping(value = "/personal/{id}")
    public String personal_page(@PathVariable("id") int id,Model model){
        User user=userRepository.findOne(id);
        model.addAttribute("user",user);
        return "personal";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("login_user");
        return "redirect:/index";
    }


}
