package com.org.ita.utils;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;

public enum Users { // ім'я, ід,
    DIANA_STOYKO(1, "Diana Stoyko",
            new com.org.ita.kata.implementation.DianaStoyko.EigthImpl(),
            new com.org.ita.kata.implementation.DianaStoyko.SevenImpl(),
            new com.org.ita.kata.implementation.DianaStoyko.SixImpl(),
            new com.org.ita.kata.implementation.DianaStoyko.FiveImpl()),


    MICHAEL_ROMANYSHYN(5, "Michael Romanyshyn",
            new com.org.ita.kata.implementation.MikeRomanyshyn.EightImpl(),
            new com.org.ita.kata.implementation.MikeRomanyshyn.SevenImpl(),
            new com.org.ita.kata.implementation.MikeRomanyshyn.SixImpl(),
            new com.org.ita.kata.implementation.MikeRomanyshyn.FiveImpl());
    private final int id;
    private final String name;
    private final Eight implEight;
    private final Seven implSeven;
    private final Six implSix;
    private final Five implFive;

    Users(int id, String name, Eight implEight, Seven implSeven, Six implSix, Five implFive) {
        this.id = id;
        this.name = name;
        this.implEight = implEight;
        this.implSeven = implSeven;
        this.implSix = implSix;
        this.implFive = implFive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Eight getImplEight() {
        return implEight;
    }

    public Seven getImplSeven() {
        return implSeven;
    }

    public Six getImplSix() {
        return implSix;
    }

    public Five getImplFive() {
        return implFive;
    }

    public Users getById(int id) {
        for (Users user : Users.values()) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

    public void printAllUserName() {
        for (Users user : Users.values()) {
            System.out.println(String.format("Id: %d, Name: %s", user.id, user.name));
        }
    }
}
