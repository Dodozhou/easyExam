package com.star.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.naming.SizeLimitExceededException;

/**
 * Created by hp on 2017/9/3.
 */
@ControllerAdvice
public class AllExceptionHandler {

    @ExceptionHandler(StringIndexOutOfBoundsException.class)
    public String doIndexOOBException(Model model){
            model.addAttribute("error", "未选中文件 /(ㄒoㄒ)/~~");
        return "upload_error";
    }

    @ExceptionHandler(IllegalStateException.class)
    public String doSizeException(Model model){
            model.addAttribute("error", "文件过大，请不要超过20M /(ㄒoㄒ)/~~");
        return "upload_error";
    }

    /*@ExceptionHandler(NoHandlerFoundException.class)
    public String handle(Model model){
        model.addAttribute("error", "对不起，您要找的文件已经不存在 /(ㄒoㄒ)/~~");
        return "upload_error";
    }*/


}
