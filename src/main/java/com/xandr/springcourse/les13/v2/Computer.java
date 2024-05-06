package com.xandr.springcourse.les13.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


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
                ", musicPlayer=" + musicPlayer.playMusic(Genre.RAP) +
                '}';
    }
}
