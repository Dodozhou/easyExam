package com.star.util;

import com.star.entity.HelpAid;
import com.star.entity.MethodSharing;
import com.star.entity.StudyAid;
import com.star.entity.User;
import com.star.entity.show.HelpAidShow;
import com.star.entity.show.MethodSharingShow;
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
public class MethodUtil {
    @Autowired
    UserRepository userRepository;

    public List<MethodSharingShow> methodTransport(List<MethodSharing> baseMethods){
        Iterator<MethodSharing> iterator=baseMethods.iterator();
        List<MethodSharingShow> methods=new ArrayList<MethodSharingShow>();
        MethodSharingShow methodShow;
        while (iterator.hasNext()){
            MethodSharing method=iterator.next();
            User user=userRepository.findOne(method.getUserId());
            methodShow=new MethodSharingShow();
            //发布者的头像和名字
            methodShow.setUserName(user.getNickname());
            methodShow.setUserImg(user.getUserImg());
            //搬迁的信息
           methodShow.setId(method.getId());
           methodShow.setUserId(method.getUserId());
           methodShow.setAcademy(method.getAcademy());
           methodShow.setSharingTitle(method.getSharingTitle());
           methodShow.setSharingContent(method.getSharingContent());
           methodShow.setSharingPraise(method.getSharingPraise());
           methodShow.setSharingCriticism(method.getSharingCriticism());
           methodShow.setReadingNumber(method.getReadingNumber());
           methodShow.setReadingImgs(method.getReadingImgs());
           methodShow.setTime(method.getTime());
           methods.add(methodShow);
        }
        return methods;
    }


}
