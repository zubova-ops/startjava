package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfGrey = new Wolf();
        wolfGrey.setGender('M');
        System.out.println("gender = " + wolfGrey.getGender());
        wolfGrey.setName("Stas seriy volk");
        System.out.println("name = " + wolfGrey.getName());
        wolfGrey.setWeight(85);
        System.out.println("weight = " + wolfGrey.getWeight());
        wolfGrey.setAge(29);
        System.out.println("age = " + wolfGrey.getAge());
        wolfGrey.setColor("blond");
        System.out.println("color = " + wolfGrey.getColor());

        wolfGrey.go();
        wolfGrey.sit();
        wolfGrey.run();
        wolfGrey.howl();
        wolfGrey.hunt();
    }
}