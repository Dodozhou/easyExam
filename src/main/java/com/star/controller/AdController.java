package com.star.controller;

import com.star.entity.*;
import com.star.entity.show.DocSeekShow;
import com.star.entity.show.HelpAidShow;
import com.star.entity.show.StudyAidShow;
import com.star.repository.*;
import com.star.util.Copys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.LinkedList;
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
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/data")
    public List<DataSharing> data(){
        return dataSharingRepository.findAll();
    }

    @RequestMapping("/help_all")
    public List<HelpAidShow> getHelp(){
        List<HelpAidShow> shows=new LinkedList<HelpAidShow>();
        List<HelpAid> helpAids=helpAidRepository.findAll();
        Iterator<HelpAid> iterator=helpAids.iterator();
        HelpAid aid;
        HelpAidShow show=new HelpAidShow();
        while (iterator.hasNext()){
            aid=iterator.next();
            Copys.copy(aid,show);
            User user=userRepository.findOne(aid.getPubId());
            show.setUserPortrait(user.getUserImg());
            shows.add(show);
        }
        return shows;
    }

    @RequestMapping("/study_all")
    public List<StudyAidShow> getStudy(){
        List<StudyAidShow> shows=new LinkedList<StudyAidShow>();
        List<StudyAid> studyAids=studyAidRepository.findAll();
        Iterator<StudyAid> iterator=studyAids.iterator();
        StudyAid aid;
        StudyAidShow show=new StudyAidShow();
        while (iterator.hasNext()){
            aid=iterator.next();
            Copys.copy(aid,show);
            User user=userRepository.findOne(aid.getPubId());
            show.setUserPortrait(user.getUserImg());
            shows.add(show);
        }
        return shows;
    }

    @RequestMapping("/method_all")
    public List<MethodSharing> get_method(){
        return shareRepository.findAll();
    }

    @RequestMapping("/seek_all")
    public List<DocSeekShow> getSeek(){
        List<DocSeekShow> shows=new LinkedList<DocSeekShow>();
        List<DocSeek> docSeeks=docSeekRepository.findAll();
        Iterator<DocSeek> iterator=docSeeks.iterator();
        DocSeekShow show =new DocSeekShow();
        DocSeek seek;
        while (iterator.hasNext()){
            seek=iterator.next();
            Copys.copy(seek,show);
            User user=userRepository.findOne(seek.getPubId());
            show.setUserPortrait(user.getUserImg());
            shows.add(show);
        }
        return shows;
    }

}
