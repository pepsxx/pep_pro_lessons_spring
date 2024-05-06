package com.xandr.springcourse.les13.v2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RockMusic implements Music {
    public RockMusic(){}
    String[] song = new String[]{"Nirvana - Smells Like Teen Spirit",
            "AC/DC - Back in Black",
            "Led Zeppelin IV - Led Zeppelin IV"};

    @Override
    public String getSong(int i) {
        return song[i];
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization - RockMusic");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction - RockMusic");
    }
}
