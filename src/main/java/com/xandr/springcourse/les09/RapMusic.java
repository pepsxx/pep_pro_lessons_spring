package com.xandr.springcourse.les09;

import org.springframework.stereotype.Component;

@Component("musicBean2")
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Eminem - Not Afraid";
    }
}
