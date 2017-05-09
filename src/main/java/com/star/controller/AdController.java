package com.star.controller;

import com.star.entity.*;
import com.star.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hp on 2017/4/11.
 */
@RestController
@RequestMapping("/ad")
public class AdController {
    @Autowired
    DataSharingRepository dataSharingRepository;
    @Autowired
    HelpAidRepository helpAidRepository;
    @Autowired
    StudyAidRepository studyAidRepository;
    @Autowired
    ShareRepository shareRepository;
    @Autowired
    DocSeekRepository docSeekRepository;

    @RequestMapping("/data")
    public List<DataSharing> data(){
        return dataSharingRepository.findAll();
    }

    @RequestMapping("/help_all")
    public List<HelpAid> getHelp(){

        return helpAidRepository.findAll();
    }

    @RequestMapping("/study_all")
    public List<StudyAid> getStudy(){
        return studyAidRepository.findAll();
    }

    @RequestMapping("/method_all")
    public List<MethodSharing> get_method(){
        return shareRepository.findAll();
    }

    @RequestMapping("/seek_all")
    public List<DocSeek> getSeek(){
        return docSeekRepository.findAll();
    }

}
