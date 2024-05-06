package com.xandr.springcourse.les11;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    String[] song = new String[]{"Nirvana - Smells Like Teen Spirit",
            "AC/DC - Back in Black",
            "Led Zeppelin IV - Led Zeppelin IV"};

    @Override
    public String getSong(int i) {
        return song[i];
    }
}
