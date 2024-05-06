package com.xandr.springcourse.les13.v3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic());
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic());
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic());
        System.out.println("--------------------------------------------------");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println("computer = " + computer);
        System.out.println("--------------------------------------------------");

        System.out.println("musicPlayer.getName() = " + musicPlayer.getName());
        System.out.println("musicPlayer.getVolume() = " + musicPlayer.getVolume());
        System.out.println("--------------------------------------------------");


        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        context.close();
    }
}
