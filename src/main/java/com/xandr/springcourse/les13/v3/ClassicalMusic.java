package com.xandr.springcourse.les13.v3;

public class ClassicalMusic implements Music {
    String[] song = new String[]{"Антонио Вивальди - Времена года",
            "Камиля Сен-Санса - Лебедь",
            "Людвига ван Бетховена - Лунная соната"};

    @Override
    public String getSong(int i) {
        return song[i];
    }
}
