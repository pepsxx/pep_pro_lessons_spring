package com.xandr.springcourse.les09;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public void doMyInit(){
        System.out.println("Doing my initialization - Player");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction - Player");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC - Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
