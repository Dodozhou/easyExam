package com.star.controller;

import com.star.entity.DataSharing;
import com.star.entity.User;
import com.star.entity.show.DataShow;
import com.star.repository.DataSharingRepository;
import com.star.repository.UserRepository;
import com.star.util.DataShowUtil;
import com.sun.org.apache.xpath.internal.operations.Mod;
import javafx.scene.chart.PieChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hp on 2017/4/6.
 */
@Controller
public class BaseController {
    @Autowired
    DataSharingRepository dataSharingRepository;
    @Autowired
    DataShowUtil dataShowUtil;

    @RequestMapping({"/","/index"})
    public String index(Model model, HttpServletRequest request){
        request.getSession().setAttribute("red_from","index");
        List<DataSharing> baseDocs=dataSharingRepository.findAll(new PageRequest(0,5)).getContent();
        model.addAttribute("docs",dataShowUtil.dataTransport(baseDocs));
        return "index";
    }

   /* @RequestMapping("/search")
    public List<DataSharing> searchData(@RequestParam("key_words") String key){

    }*/
}
