package com.star.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.naming.SizeLimitExceededException;

/**
 * Created by hp on 2017/9/3.
 */
@ControllerAdvice
public class AllExceptionHandler {

    @ExceptionHandler(StringIndexOutOfBoundsException.class)
    public String doRunTimeException(Model model){
            model.addAttribute("error", "未选中文件");
        return "upload_error";
    }

    @ExceptionHandler(IllegalStateException.class)
    public String doSizeException(Model model){
            model.addAttribute("error", "文件过大，请不要超过2M");
        return "upload_error";
    }

}
