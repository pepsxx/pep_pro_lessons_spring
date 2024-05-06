package com.xandr.springcourse.les10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL10.xml"); // Файл из папки с ресурсами.
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic());
        System.out.println("--------------------------------------------------");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println("computer = " + computer);
        System.out.println("--------------------------------------------------");


        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        context.close();
    }
}
