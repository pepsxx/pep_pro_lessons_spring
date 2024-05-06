package com.xandr.springcourse.les10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired // @Autowired можно сюда.
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer() {
    }

    //@Autowired // @Autowired можно сюда.
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    //@Autowired // @Autowired можно сюда.
    public void setMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public String playMusic() {
        return classicalMusic.getSong() + " - and next - " + rockMusic.getSong();
    }

    // Архив------------------------------------------------------------------------------------------------------------
    private String name;
    private int volume;

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
}
