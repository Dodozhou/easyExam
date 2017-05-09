package com.star.controller;

import com.star.entity.DocSeek;
import com.star.entity.User;
import com.star.repository.DocSeekRepository;
import com.star.util.DateUtil;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

/**
 * Created by hp on 2017/4/8.
 */
@Controller
public class SeekController {
    @Autowired
    DocSeekRepository repository;
    @Autowired
    DateUtil dateUtil;

    @RequestMapping(value = "/doc_seek",method = RequestMethod.GET)
    public String doc_seek(Model model,HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("login_user");
        if (user == null){
            return "redirect:/login";
        }else {
            model.addAttribute("seek", new DocSeek());
            System.out.println(user.getId());
            model.addAttribute("publisher_id",user.getId());
            return "seekdoc";
        }
    }

    @RequestMapping(value = "/doc_seek",method = RequestMethod.POST)
    public String seek(DocSeek seek,int publisher_id){
            seek.setPubDate(DateUtil.currentTime());
            seek.setPubId(publisher_id);
            repository.save(seek);
            return "success";
    }

    @RequestMapping("/seek_all")
    public String seek_all(Model model){
        model.addAttribute("seeks",repository.findAll());
        return "docsneed";
    }
}
