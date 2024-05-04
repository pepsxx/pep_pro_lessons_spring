package com.xandr.springcourse.les07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL07.xml"); // Файл из папки с ресурсами.

        MusicPlayer firstMusicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);

        boolean comparison = firstMusicPlayerBean == secondMusicPlayerBean;
        System.out.println("comparison = " + comparison);

        System.out.println("firstMusicPlayerBean  = " + firstMusicPlayerBean);
        System.out.println("secondMusicPlayerBean = " + secondMusicPlayerBean);

        firstMusicPlayerBean.setVolume(10);
        secondMusicPlayerBean.setVolume(20);

        firstMusicPlayerBean.playMusic();
        System.out.println("musicPlayerBean.getName() = " + firstMusicPlayerBean.getName());
        System.out.println("musicPlayerBean.getVolume() = " + firstMusicPlayerBean.getVolume());

        secondMusicPlayerBean.playMusic();
        System.out.println("secondMusicPlayerBean.getName() = " + secondMusicPlayerBean.getName());
        System.out.println("secondMusicPlayerBean.getVolume() = " + secondMusicPlayerBean.getVolume());

        context.close();
    }
}
