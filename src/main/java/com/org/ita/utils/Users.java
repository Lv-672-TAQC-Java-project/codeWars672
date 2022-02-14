package com.org.ita.utils;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;

import java.util.NoSuchElementException;

public enum Users {
    DIANA_STOYKO(1, "Diana Stoyko",
            new com.org.ita.kata.implementation.DianaStoyko.EigthImpl(),
            new com.org.ita.kata.implementation.DianaStoyko.SevenImpl(),
            new com.org.ita.kata.implementation.DianaStoyko.SixImpl(),
            new com.org.ita.kata.implementation.DianaStoyko.FiveImpl()),
    IRYNA_RYBAK(2, "Iryna Rybak",
            new com.org.ita.kata.implementation.IrynaRybak.EigthImpl(),
            new com.org.ita.kata.implementation.IrynaRybak.SevenImpl(),
            new com.org.ita.kata.implementation.IrynaRybak.SixImpl(),
            new com.org.ita.kata.implementation.IrynaRybak.FiveImpl()),
    KATERYNA_MUSHYNSKA(3, "Kateryna Mushynska",
            new com.org.ita.kata.implementation.KaterynaMushynska.EightImpl(),
            new com.org.ita.kata.implementation.KaterynaMushynska.SevenImpl(),
            new com.org.ita.kata.implementation.KaterynaMushynska.SixImpl(),
            new com.org.ita.kata.implementation.KaterynaMushynska.FiveImpl()),
    MICHAEL_ROMANYSHYN(4, "Michael Romanyshyn",
            new com.org.ita.kata.implementation.MikeRomanyshyn.EightImpl(),
            new com.org.ita.kata.implementation.MikeRomanyshyn.SevenImpl(),
            new com.org.ita.kata.implementation.MikeRomanyshyn.SixImpl(),
            new com.org.ita.kata.implementation.MikeRomanyshyn.FiveImpl()),
    OLEH_PYSKO(5, "Oleh Pysko",
            new com.org.ita.kata.implementation.OlehPysko.EightImpl(),
            new com.org.ita.kata.implementation.OlehPysko.SevenImpl(),
            new com.org.ita.kata.implementation.OlehPysko.SixImpl(),
            new com.org.ita.kata.implementation.OlehPysko.FiveImpl()),
    OLIA_DMYTRYK(6, "Olia Dmytryk",
            new com.org.ita.kata.implementation.OliaDmytryk.EightImpl(),
            new com.org.ita.kata.implementation.OliaDmytryk.SevenIml(),
            new com.org.ita.kata.implementation.OliaDmytryk.SixImpl(),
            new com.org.ita.kata.implementation.OliaDmytryk.FiveIml()),
    POPENKO_INNA(7, "Popenko Inna",
            new com.org.ita.kata.implementation.PopenkoI.EightImpl(),
            new com.org.ita.kata.implementation.PopenkoI.SevenImpl(),
            new com.org.ita.kata.implementation.PopenkoI.SixImpl(),
            new com.org.ita.kata.implementation.PopenkoI.FiveImpl()),
    ROMAN_VYTRYKUSH(8, "Roman Vytrykush",
            new com.org.ita.kata.implementation.RomanVytrykush.EightImpl(),
            new com.org.ita.kata.implementation.RomanVytrykush.SevenImpl(),
            new com.org.ita.kata.implementation.RomanVytrykush.SixImpl(),
            new com.org.ita.kata.implementation.RomanVytrykush.FiveImpl()),
    YEVGEN_ROMANOV(9, "Yevgen Romanov",
            new com.org.ita.kata.implementation.YevgenAleksandrovich.Eightimpl(),
            new com.org.ita.kata.implementation.YevgenAleksandrovich.Sevenimpl(),
            new com.org.ita.kata.implementation.YevgenAleksandrovich.Siximpl(),
            new com.org.ita.kata.implementation.YevgenAleksandrovich.Fiveimpl()),
    YURII_DRUZHYTSKYI(10, "Yurii Druzhytskyi",
            new com.org.ita.kata.implementation.YuriiDruzhytskyi.EightImpl(),
            new com.org.ita.kata.implementation.YuriiDruzhytskyi.SevenImpl(),
            new com.org.ita.kata.implementation.YuriiDruzhytskyi.SixImpl(),
            new com.org.ita.kata.implementation.YuriiDruzhytskyi.FiveImpl());

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

    public static Users getById(int id) {
        for (Users user : Users.values()) {
            if (user.id == id) {
                return user;
            }
        }
        throw new NoSuchElementException("There is no user with this id: " + id);
    }

    public static void printAllUserName() {
        for (Users user : Users.values()) {
            System.out.println(String.format("Id: %d, Name: %s", user.id, user.name));
        }
    }
}
