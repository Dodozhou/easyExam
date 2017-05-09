package com.star.util;

import com.star.entity.DataSharing;
import com.star.entity.User;
import com.star.entity.show.DataShow;
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
public class DataShowUtil {
    @Autowired
    UserRepository userRepository;

    public List<DataShow> dataTransport(List<DataSharing> baseDocs){
        Iterator<DataSharing> iterator=baseDocs.iterator();
        List<DataShow> docs=new ArrayList<DataShow>();
        DataShow dataShow;
        while (iterator.hasNext()){
            DataSharing data=iterator.next();
            User user=userRepository.findOne(data.getUserId());
            dataShow=new DataShow();
            dataShow.setId(data.getId());
            dataShow.setUserId(data.getUserId());
            dataShow.setDataTitle(data.getDataTitle());
            dataShow.setDataDescription(data.getDataDescription());
            dataShow.setDataUrl(data.getDataUrl());
            dataShow.setDownloadNumber(data.getDownloadNumber());
            dataShow.setViewNumber(data.getViewNumber());
            dataShow.setDataPraise(data.getDataPraise());
            dataShow.setDataCategory(data.getDataCategory());
            dataShow.setDataImgs(data.getDataImgs());
            dataShow.setDataGrade(data.getDataGrade());
            dataShow.setDataCollege(data.getDataCollege());
            dataShow.setPubDate(data.getPubDate());
            dataShow.setOwnerImg(user.getUserImg());
            dataShow.setOwnerName(user.getNickname());
            dataShow.setOnwerId(user.getId());
            docs.add(dataShow);
        }
        return docs;
    }
}
