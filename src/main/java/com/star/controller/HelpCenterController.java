package com.star.controller;

import com.star.entity.HelpAid;
import com.star.entity.StudyAid;
import com.star.entity.User;
import com.star.repository.HelpAidRepository;
import com.star.repository.StudyAidRepository;
import com.star.util.DateUtil;
import com.star.util.HelpStudyUtil;
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
    @Autowired
    DateUtil dateUtil;
    @Autowired
    HelpStudyUtil helpStudyUtil;

    @RequestMapping("/help_center")
    public String centerPage(Model model, HttpServletRequest request){
        User user=(User) request.getSession().getAttribute("login_user");
        if (user==null){
           request.getSession().setAttribute("red_from","help");
            return "redirect:/login";
        }
        else {
            model.addAttribute("login_id",user.getId());
            model.addAttribute("helps", helpStudyUtil.helpTransport(helpRepository.findAll()));
            model.addAttribute("studys", helpStudyUtil.studyTransport(studyRepository.findAll()));
            model.addAttribute("new_help", new HelpAid());
            model.addAttribute("new_study", new StudyAid());
            return "help";
        }
    }

    @RequestMapping("/help_up")
    public String helpUp(HelpAid new_help,@RequestParam("login_id") int login_id){
        new_help.setPubId(login_id);
        new_help.setViewNumb(1);
        new_help.setCommentNumb(0);
        new_help.setPraiseNumb(0);
        new_help.setTime(DateUtil.currentTime());
        helpRepository.save(new_help);
        helpRepository.flush();
        return "redirect:/help_center";
    }

    @RequestMapping("/study_up")
    public String studyUp(StudyAid new_study,@RequestParam("login_id") int login_id){
        new_study.setPubId(login_id);
        new_study.setViewNumb(1);
        new_study.setCommentNumb(0);
        new_study.setPraiseNumb(0);
        new_study.setTime(DateUtil.currentTime());
        studyRepository.save(new_study);
        studyRepository.flush();
        return "redirect:/help_center";
    }
}
