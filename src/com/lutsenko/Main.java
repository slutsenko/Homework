package com.lutsenko;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];

        Fruit greenApple = new Fruit();
        greenApple.setType(Fruit.Type.APPLE);
        greenApple.setColor(Color.GREEN);
        greenApple.setWeight(186);
        greenApple.setPrice(25.90);

        fruits[0] = greenApple;

        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 146, 26.90);
        fruits[1] = redApple;

        System.out.println(Arrays.toString(fruits));

        System.out.println("Green apple price:" + greenApple.calculatePrice());
        System.out.println("Red apple price:" + redApple.calculatePrice());


    }

}




















