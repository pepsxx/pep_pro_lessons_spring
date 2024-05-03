package com.xandr.springcourse.les06.v1;

import com.xandr.springcourse.les06.v1.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
