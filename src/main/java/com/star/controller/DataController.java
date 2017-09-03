package com.star.controller;

import com.star.entity.DataSharing;
import com.star.entity.User;
import com.star.repository.DataSharingRepository;
import com.star.util.DateUtil;
import com.star.util.ImgPathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by hp on 2017/4/7.
 */
@Controller
public class DataController {
    @Autowired
    DataSharingRepository dataRepository;

    @Autowired
    ImgPathUtil imgPathUtil;

    @RequestMapping(value = "/data/upload", method = RequestMethod.GET)
    public String uploadPage(Model model, HttpServletRequest request) {
        model.addAttribute("doc", new DataSharing());
        User login_user = (User) request.getSession().getAttribute("login_user");
        if (login_user == null) {
            return "redirect:/login";
        }
        return "data_upload";
    }

    @RequestMapping(value = "/data/upload", method = RequestMethod.POST)
    public String upload(DataSharing doc, @RequestPart("doc_file") MultipartFile file,
                         @RequestPart("doc_img") MultipartFile img, HttpServletRequest request) throws IOException {
        User login_user = (User) request.getSession().getAttribute("login_user");
        doc.setUserId(login_user.getId());
        doc.setDownloadNumber(0);
        doc.setDataPraise(0);
        doc.setViewNumber(1);

        String dataUrl = imgPathUtil.saveImgs(request, file, "data/doc");
        doc.setDataUrl(dataUrl);
        String dataImg = imgPathUtil.saveImgs(request, img, "data/img");
        doc.setDataImgs(dataImg);
        String pubDate= DateUtil.currentTime();
        doc.setPubDate(pubDate);
        dataRepository.save(doc);
        dataRepository.flush();
        return "redirect:/data/upload_success";
    }

    @RequestMapping("/data/upload_success")
    public String success() {
        return "success";
    }

    @RequestMapping(value = "/exam_data")
    public String exam_data() {
        return "college";
    }

    @RequestMapping(value = "/college_detail/{college}")
    public String collegeDetail(@PathVariable("college")String college,
                                Model model) {
        List<DataSharing> sharings=dataRepository.findByDataCollege(college);
        System.out.println(sharings.size());
        model.addAttribute("sharings",sharings);
        model.addAttribute("college",college);
        return "collegefile";
    }



}
