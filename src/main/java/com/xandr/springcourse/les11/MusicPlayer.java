package com.xandr.springcourse.les11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class MusicPlayer {

    @Autowired // @Autowired можно сюда.
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    //@Autowired // @Autowired можно сюда.
    //@Qualifier ("classicalMusic")
    private Music music1;
    private Music music2;
    private Music music3;

    //@Autowired // @Autowired можно сюда.
    public void setMusic(Music music1) {
        this.music1 = music1;
    }

    public String playMusic(Genre genre) {
        int r = ThreadLocalRandom.current().nextInt(3);
        switch (genre) {
            case RAP:
                return music3.getSong(r);
            case ROCK:
                return music1.getSong(r);
            case CLASSICAL:
                return music2.getSong(r);
        }
        return "Error";
    }
}
