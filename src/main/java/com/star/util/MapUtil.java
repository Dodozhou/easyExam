package com.star.util;

import com.star.entity.*;
import com.star.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hp on 2017/9/16.
 */
@Component
public class MapUtil {
    @Autowired
    UserRepository userRepository;

    public Map<User,DataSharing> datasharingUtil(List<DataSharing> baseDocs){
        Map<User,DataSharing> udmap=new HashMap<User, DataSharing>();
        for (DataSharing dataSharing : baseDocs) {
            User user = userRepository.findOne(dataSharing.getUserId());
            udmap.put(user, dataSharing);
        }
        return udmap;
    }

    public Map<User,HelpAid> helpUtil(List<HelpAid> helps){
        Map<User,HelpAid> uhmap=new HashMap<User, HelpAid>();
        for (HelpAid aid : helps) {
            User user = userRepository.findOne(aid.getPubId());
            uhmap.put(user, aid);
        }
        return uhmap;
    }

    public Map<User,StudyAid> studyUtil(List<StudyAid> studys){
        Map<User,StudyAid> usmap=new HashMap<User, StudyAid>();
        for (StudyAid aid : studys) {
            User user = userRepository.findOne(aid.getPubId());
            usmap.put(user, aid);
        }
        return usmap;
    }

    public Map<User,MethodSharing> methodUtil(List<MethodSharing> methods){
        Map<User,MethodSharing> ummap=new HashMap<User,MethodSharing>();
        for (MethodSharing method : methods) {
            User user = userRepository.findOne(method.getUserId());
            ummap.put(user, method);
        }
        return ummap;
    }
    public Map<User,DocSeek> docSeekUtil(List<DocSeek> seeks){
        Map<User,DocSeek> ummap=new HashMap<User,DocSeek>();
        for (DocSeek seek : seeks) {
            User user = userRepository.findOne(seek.getPubId());
            ummap.put(user, seek);
        }
        return ummap;
    }



}
