package com.xandr.springcourse.les06.v2;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public void playMusic() {
        for (Music music1 : musicList) {
            System.out.println("Playing: " + music1.getSong());
        }
    }

    //constructor-------------------------------------------------------------------------------------------------------
    public MusicPlayer() {
    }

    //set-----get-------------------------------------------------------------------------------------------------------
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
