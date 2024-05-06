package com.xandr.springcourse.les09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL09.xml"); // Файл из папки с ресурсами.
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


        RockMusic rockMusic = context.getBean("musicBean3", RockMusic.class); // Название "musicBean3" - так как указали в аннотации.
        System.out.println("rockMusic.getSong() = " + rockMusic.getSong());

        MusicPlayer musicPlayer = new MusicPlayer(rockMusic);
        musicPlayer.playMusic();
        System.out.println("--------------------------------------------------");


        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println("classicalMusic.getSong() = " + classicalMusic.getSong());

        musicPlayer.playMusic();
        System.out.println("--------------------------------------------------");


        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        context.close();
    }
}
