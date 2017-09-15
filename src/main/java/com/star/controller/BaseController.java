package com.star.controller;

import com.star.entity.DataSharing;
import com.star.repository.DataSharingRepository;
import com.star.util.DataShowUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
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

}
