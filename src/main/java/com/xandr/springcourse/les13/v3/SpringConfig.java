package com.xandr.springcourse.les13.v3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

    @Bean
    public List<Music> musicList(){

        // v1
        List<Music> music = new ArrayList<>();
        music.add(classicalMusic());
        music.add(rockMusic());
        music.add(rapMusic());
        return music;

        // v2
        //return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    }

}

