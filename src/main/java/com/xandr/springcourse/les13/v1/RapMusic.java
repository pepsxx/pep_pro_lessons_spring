package com.xandr.springcourse.les13.v1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RapMusic implements Music {
    String[] song = new String[]{"Кендрика Ламара - Money Trees",
            "Маклемора и Райана Льюиса - Thrift Shop",
            "Лил Наса X - Old Town Road"};

    @Override
    public String getSong(int i) {
        return song[i];
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization - RapMusic");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction - RapMusic");
    }
}
