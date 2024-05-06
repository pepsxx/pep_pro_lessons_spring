package com.xandr.springcourse.les11;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    String[] song = new String[]{"Кендрика Ламара - Money Trees",
            "Маклемора и Райана Льюиса - Thrift Shop",
            "Лил Наса X - Old Town Road"};

    @Override
    public String getSong(int i) {
        return song[i];
    }
}
