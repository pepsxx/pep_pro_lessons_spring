package com.xandr.springcourse.les06.v2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL06V2.xml"); // Файл из папки с ресурсами.

        MusicPlayer musicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);

        musicPlayerBean.playMusic();
        System.out.println("musicPlayerBean.getName() = " + musicPlayerBean.getName());
        System.out.println("musicPlayerBean.getVolume() = " + musicPlayerBean.getVolume());

        context.close();
    }
}
