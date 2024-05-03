package com.xandr.springcourse.les05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL05.xml"); // Файл из папки с ресурсами.

        MusicPlayer musicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);

        musicPlayerBean.playMusic();

        context.close();
    }
}
