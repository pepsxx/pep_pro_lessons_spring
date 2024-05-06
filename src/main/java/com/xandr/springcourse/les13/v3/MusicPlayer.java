package com.xandr.springcourse.les13.v3;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class MusicPlayer {

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int Volume;

    private List<Music> music;

    public String playMusic() {
        int g = ThreadLocalRandom.current().nextInt(3);
        int t = ThreadLocalRandom.current().nextInt(3);
        return music.get(g).getSong(t);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return Volume;
    }
}
