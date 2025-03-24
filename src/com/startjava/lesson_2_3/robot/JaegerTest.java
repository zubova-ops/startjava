package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args ) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", "USA", 250, 3, 6, 8);

        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(260);
        jaegerOne.setWeight(2);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);

        jaegerOne.sit();
        jaegerOne.go();
        jaegerOne.move();
        jaegerOne.drift();

        System.out.println("name = " + jaegerOne.getModelName());
        System.out.println("name2 = " + jaegerTwo.getModelName());
    }
}