package com.startjava.lesson_2_3.animal;

public class Wolf {
    private char gender;
    private String name;
    private int weight;
    private int age;
    private String color;

    public char getGender() {
        return gender;
    }
    void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }
    void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }


    public void go() {
        System.out.println("I'm coming");
    }

    public void sit() {
        System.out.println("I'm sitting");
    }

    public void run() {
        System.out.println("I'm running");
    }

    public void howl() {
        System.out.println("I'm howling");
    }

    public void hunt() {
        System.out.println("I'm hunting");
    }
}