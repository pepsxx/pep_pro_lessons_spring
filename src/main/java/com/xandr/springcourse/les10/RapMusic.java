package com.xandr.springcourse.les10;

import org.springframework.stereotype.Component;


public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Eminem - Not Afraid";
    }
}
