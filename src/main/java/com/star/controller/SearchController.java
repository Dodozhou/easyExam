package com.star.controller;

import com.star.entity.DataSharing;
import com.star.repository.DataSharingRepository;
import com.star.util.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by hp on 2017/8/31.
 */
@Controller
public class SearchController {
    @Autowired
    private DataSharingRepository dataSharingRepository;
    @Autowired
    MapUtil mapUtil;

    @RequestMapping("/search")//这里只能用@RequestParam而不能用@Param，不知道为啥
    public String searchData(@RequestParam("key_words") String key, Model model){
        String key2="";
        key=key.trim();
        key=key.replaceAll("\\s+",",");
        String[] keys=key.split(",");
        for (String key1 : keys) {
            key2 = key2 + "%" + key1;
        }
        key2=key2.concat("%");
        List<DataSharing> datas= dataSharingRepository.searchDataSharing(key2);
        model.addAttribute("docs",mapUtil.datasharingUtil(datas));
        return "search_result";
    }
}
