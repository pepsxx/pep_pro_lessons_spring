package com.xandr.springcourse.les12;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class RockMusic implements Music {
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
