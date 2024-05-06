package com.xandr.springcourse.les10;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public void doMyInit(){
        System.out.println("Doing my initialization - RockMusic");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction - RockMusic");
    }
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
