package com.xandr.springcourse.les13.v3;


public class Computer {

    Computer (MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }
private int id;
private MusicPlayer musicPlayer;
    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playMusic() +
                '}';
    }
}
