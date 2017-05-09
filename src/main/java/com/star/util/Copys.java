package com.star.util;

import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 2017/5/9.
 */
@Component
public class Copys {
    public static void copy(Object src, Object dest) {



        Map<String, Object> srcMap = new HashMap<String, Object>();

        Field[] srcFields = src.getClass().getDeclaredFields();

        for (Field fd : srcFields) {

            try {

                srcMap.put(fd.getName(), fd.get(src)); //获取属性值

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

        Field[] destFields = dest.getClass().getDeclaredFields();

        for (Field fd : destFields) {

            if (srcMap.get(fd.getName()) == null) {

                continue;

            }

            try {

                fd.set(dest, srcMap.get(fd.getName())); //给属性赋值

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }
}
