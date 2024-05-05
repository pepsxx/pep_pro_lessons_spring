package com.xandr.springcourse.les08;

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
