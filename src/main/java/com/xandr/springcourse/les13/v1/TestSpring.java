package com.xandr.springcourse.les13.v1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic(Genre.CLASSICAL));
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic(Genre.RAP));
        System.out.println("musicPlayer.playMusic() = " + musicPlayer.playMusic(Genre.ROCK));
        System.out.println("--------------------------------------------------");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println("computer = " + computer);
        System.out.println("--------------------------------------------------");

        System.out.println("musicPlayer.getName() = " + musicPlayer.getName());
        System.out.println("musicPlayer.getVolume() = " + musicPlayer.getVolume());
        System.out.println("--------------------------------------------------");

        ClassicalMusic classicalMusic1 = context.getBean( "classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean( "classicalMusic", ClassicalMusic.class);
        System.out.println("classicalMusic1 = " + classicalMusic1);
        System.out.println("classicalMusic2 = " + classicalMusic2);
        System.out.println("--------------------------------------------------");

        RockMusic rockMusic1 = context.getBean( "rockMusic", RockMusic.class);
        RockMusic rockMusic2 = context.getBean( "rockMusic", RockMusic.class);
        System.out.println("rockMusic1 = " + rockMusic1);
        System.out.println("rockMusic2 = " + rockMusic2);
        System.out.println("--------------------------------------------------");

        RapMusic rapMusic1 = context.getBean( "rapMusic", RapMusic.class);
        RapMusic rapMusic2 = context.getBean( "rapMusic", RapMusic.class);
        System.out.println("rapMusic1 = " + rapMusic1);
        System.out.println("rapMusic2 = " + rapMusic2);
        System.out.println("--------------------------------------------------");


        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        context.close();
    }
}
