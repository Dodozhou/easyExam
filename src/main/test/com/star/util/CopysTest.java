package com.star.util;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by hp on 2017/5/9.
 */
public class CopysTest {

    @Test
    public void copy()  {
        child child=new child();
        child.setName("xiaoming");
        child.setAge(12);
        student student=new student();
        Copys.copy(child,student);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGrade());
    }

}