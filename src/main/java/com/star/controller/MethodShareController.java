package com.star.controller;

import com.star.entity.MethodSharing;
import com.star.entity.User;
import com.star.repository.ShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by hp on 2017/4/9.
 */
@Controller
public class MethodShareController {
    @Autowired
    ShareRepository shareRepository;

    @RequestMapping("/method_share")
    public String sharePage(Model model, HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("login_user");
        if (user==null){
            request.getSession().setAttribute("red_from","method");
            return "redirect:/login";
        }else {
            List<MethodSharing> sharings=shareRepository.findAll();
            System.out.println(sharings.size());
            model.addAttribute("sharings",sharings);
            model.addAttribute("new_share", new MethodSharing());
            model.addAttribute("user_id", user.getId());
            return "share";
        }
    }

    @RequestMapping(value = "/share_up",method = RequestMethod.POST)
    public String shareUp(MethodSharing new_share,Model model,HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("login_user");
        new_share.setReadingNumber(1);
        new_share.setSharingCriticism(0);
        new_share.setSharingPraise(0);
        new_share.setUserId(user.getId());
        MethodSharing sharing=shareRepository.save(new_share);
        shareRepository.flush();
     /*return "redirect:/share_detail/"+sharing.getId();*/
        return "redirect:/method_share";

    }

    @RequestMapping("/share_detail/{share_id}")
    public String shareDetail(@PathVariable("share_id") int shareId,Model model){
        MethodSharing methodSharing=shareRepository.findOne(shareId);
        System.out.println(methodSharing.getSharingTitle());
        System.out.println(methodSharing.getSharingContent());
        model.addAttribute("share",methodSharing);
        return "sharedetail";
    }

}
