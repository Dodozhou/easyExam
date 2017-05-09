package com.star.controller;

import com.star.entity.HelpAid;
import com.star.entity.StudyAid;
import com.star.entity.User;
import com.star.repository.HelpAidRepository;
import com.star.repository.StudyAidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hp on 2017/4/9.
 */
@Controller
public class HelpCenterController {
    @Autowired
    HelpAidRepository helpRepository;
    @Autowired
    StudyAidRepository studyRepository;

    @RequestMapping("/help_center")
    public String centerPage(Model model, HttpServletRequest request){
        User user=(User) request.getSession().getAttribute("login_user");
        if (user==null){
           request.getSession().setAttribute("red_from","help");
            return "redirect:/login";
        }
        else {
            model.addAttribute("login_id",user.getId());
            model.addAttribute("helps", helpRepository.findAll());
            model.addAttribute("studys", studyRepository.findAll());
            model.addAttribute("new_help", new HelpAid());
            model.addAttribute("new_study", new StudyAid());
            return "help";
        }
    }

    @RequestMapping("/help_up")
    public String helpUp(HelpAid new_help,@RequestParam("login_id") int login_id){
        new_help.setPubId(login_id);
        helpRepository.save(new_help);
        helpRepository.flush();
        return "redirect:/help_center";
    }

    @RequestMapping("/study_up")
    public String studyUp(StudyAid new_study,@RequestParam("login_id") int login_id){
        new_study.setPubId(login_id);
        studyRepository.save(new_study);
        studyRepository.flush();
        return "redirect:/help_center";
    }
}
