package com.xandr.springcourse.les05;

public class MusicPlayer {
    private Music music;

    // IoC - Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println("Playing: " + music.getSong());
    }
}
