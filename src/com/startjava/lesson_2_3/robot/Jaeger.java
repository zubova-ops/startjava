package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private int height;
    private int weight;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, int height, int weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public Jaeger() {}

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    void setHeight(int height) {
        this.height = height;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }
    
    void setArmor(int armor) {
        this.armor = armor;
    }


    public void go() {
        System.out.println("coming");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void move() {
        System.out.println("moving");
    }

    boolean drift() {
        return true;
    }
}