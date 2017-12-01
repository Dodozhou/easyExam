package com.star.controller;

import com.google.gson.Gson;
import com.star.repository.DataSharingRepository;
import com.star.util.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class MobileController {
    @Autowired
    MapUtil mapUtil;
    @Autowired
    DataSharingRepository dataSharingRepository;

    @RequestMapping(value ="/mobile/getData",produces = {"application/json;charset=UTF-8"})
    public String getData(){
        Gson gson=new Gson();
        return gson.toJson(mapUtil.datasharingUtil(dataSharingRepository.findAll()));
    }
}
