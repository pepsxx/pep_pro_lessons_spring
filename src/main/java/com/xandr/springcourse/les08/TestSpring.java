package com.xandr.springcourse.les08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL08.xml"); // Файл из папки с ресурсами.
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        RockMusic rockMusic = context.getBean("musicBean2", RockMusic.class);
        System.out.println("rockMusic.getSong() = " + rockMusic.getSong());
        System.out.println("--------------------------------------------------");

        MusicPlayer firstMusicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);

        firstMusicPlayerBean.setVolume(10);
        secondMusicPlayerBean.setVolume(20);
        System.out.println("--------------------------------------------------");

        firstMusicPlayerBean.playMusic();
        System.out.println("musicPlayerBean.getName() = " + firstMusicPlayerBean.getName());
        System.out.println("musicPlayerBean.getVolume() = " + firstMusicPlayerBean.getVolume());
        System.out.println("--------------------------------------------------");

        secondMusicPlayerBean.playMusic();
        System.out.println("secondMusicPlayerBean.getName() = " + secondMusicPlayerBean.getName());
        System.out.println("secondMusicPlayerBean.getVolume() = " + secondMusicPlayerBean.getVolume());

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        context.close();
    }
}
