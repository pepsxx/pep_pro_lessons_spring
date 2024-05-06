package com.xandr.springcourse.les11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL11.xml"); // Файл из папки с ресурсами.
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic(Genre.CLASSICAL));
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic(Genre.RAP));
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic(Genre.ROCK));
        System.out.println("--------------------------------------------------");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println("computer = " + computer);
        System.out.println("--------------------------------------------------");


        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        context.close();
    }
}
