package com.xandr.springcourse.les12;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    String[] song = new String[]{"Антонио Вивальди - Времена года",
            "Камиля Сен-Санса - Лебедь",
            "Людвига ван Бетховена - Лунная соната"};

    @Override
    public String getSong(int i) {
        return song[i];
    }
}
