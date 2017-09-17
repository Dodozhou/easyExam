package com.star.controller;

import com.star.entity.*;
import com.star.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by hp on 2017/4/11.
 */
@RestController
@RequestMapping("/ad")
public class AdController {   //安卓接口
    @Autowired
    private
    DataSharingRepository dataSharingRepository;
    @Autowired
    private
    HelpAidRepository helpAidRepository;
    @Autowired
    private
    StudyAidRepository studyAidRepository;
    @Autowired
    private
    ShareRepository shareRepository;
    @Autowired
    private
    DocSeekRepository docSeekRepository;
    @Autowired
    private
    UserRepository userRepository;

    @RequestMapping("/data")
    public List<DataSharing> data(){
        return dataSharingRepository.findAll();
    }

    @RequestMapping("/help_all")
    public Map<User, HelpAid> getHelp(){
        Map<User,HelpAid> uhmap=new HashMap<User, HelpAid>();
        List<HelpAid> helpAids=helpAidRepository.findAll();
        for (HelpAid aid: helpAids) {
            User user=userRepository.findOne(aid.getPubId());
            uhmap.put(user,aid);
        }
        return uhmap;
    }

    @RequestMapping("/study_all")
    public Map<User, StudyAid> getStudy(){
       Map<User,StudyAid> usmap=new HashMap<User, StudyAid>();
        List<StudyAid> studyAids=studyAidRepository.findAll();
        for (StudyAid aid :studyAids) {
            User user=userRepository.findOne(aid.getPubId());
            usmap.put(user,aid);
        }
        return usmap;
    }

    @RequestMapping("/method_all")
    public List<MethodSharing> get_method(){
        return shareRepository.findAll();
    }

    @RequestMapping("/seek_all")
    public Map<User, DocSeek> getSeek(){
       Map<User,DocSeek> udmap=new HashMap<User, DocSeek>();
        List<DocSeek> docSeeks=docSeekRepository.findAll();
        for (DocSeek seek: docSeeks) {
            User user=userRepository.findOne(seek.getPubId());
            udmap.put(user,seek);
        }
        return udmap;
    }

}
