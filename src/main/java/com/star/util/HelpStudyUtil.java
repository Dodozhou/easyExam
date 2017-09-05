package com.star.util;

import com.star.entity.DataSharing;
import com.star.entity.HelpAid;
import com.star.entity.StudyAid;
import com.star.entity.User;
import com.star.entity.show.DataShow;
import com.star.entity.show.HelpAidShow;
import com.star.entity.show.StudyAidShow;
import com.star.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hp on 2017/4/20.
 */
@Component
public class HelpStudyUtil {
    @Autowired
    UserRepository userRepository;

    public List<HelpAidShow> helpTransport(List<HelpAid> baseHelps){
        Iterator<HelpAid> iterator=baseHelps.iterator();
        List<HelpAidShow> helps=new ArrayList<HelpAidShow>();
        HelpAidShow helpShow;
        while (iterator.hasNext()){
            HelpAid help=iterator.next();
            User user=userRepository.findOne(help.getPubId());
            helpShow=new HelpAidShow();
            //发布者的头像和名字
            helpShow.setUserName(user.getNickname());
            helpShow.setUserPortrait(user.getUserImg());
            //搬迁的信息
            helpShow.setId(help.getId());
            helpShow.setPubId(help.getPubId());
            helpShow.setAcademy(help.getAcademy());
            helpShow.setPubGrade(help.getPubGrade());
            helpShow.setHelpSubject(help.getHelpSubject());
            helpShow.setHelpNeed(help.getHelpNeed());
            helpShow.setPubPhone(help.getPubPhone());
            helpShow.setViewNumb(help.getViewNumb());
            helpShow.setCommentNumb(help.getCommentNumb());
            helpShow.setPraiseNumb(help.getPraiseNumb());
            helpShow.setTime(help.getTime());
            helps.add(helpShow);
        }
        return helps;
    }

    public List<StudyAidShow> studyTransport(List<StudyAid> basestudys){
        Iterator<StudyAid> iterator=basestudys.iterator();
        List<StudyAidShow> studys=new ArrayList<StudyAidShow>();
        StudyAidShow studyShow;
        while (iterator.hasNext()){
            StudyAid study=iterator.next();
            User user=userRepository.findOne(study.getPubId());
            studyShow=new StudyAidShow();
            //发布者的头像和名字
            studyShow.setUserName(user.getNickname());
            studyShow.setUserPortrait(user.getUserImg());

            //搬迁的信息
            studyShow.setId(study.getId());
            studyShow.setPubId(study.getPubId());
            studyShow.setAcademy(study.getAcademy());
            studyShow.setPubGrade(study.getPubGrade());
            studyShow.setStudySubject(study.getStudySubject());
            studyShow.setPubDescription(study.getPubDescription());
            studyShow.setShareScore(study.getShareScore());
            studyShow.setPubPhone(study.getPubPhone());
            studyShow.setViewNumb(study.getViewNumb());
            studyShow.setCommentNumb(study.getCommentNumb());
            studyShow.setPraiseNumb(study.getPraiseNumb());
            studyShow.setTime(study.getTime());
            studys.add(studyShow);
        }
        return studys;
    }
}
