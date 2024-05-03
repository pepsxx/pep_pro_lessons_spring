package com.xandr.springcourse.les02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL02.xml"); // Файл из папки с ресурсами.

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println("testBean.getName() = " + testBean.getName());
        context.close();

    }
}
