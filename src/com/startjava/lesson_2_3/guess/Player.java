package com.startjava.lesson_2_3.guess;

public class Player {
    private String name;
    private int number;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }
}