package com.lutsenko;


import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];

        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 186, 25.90);
        fruits[0] = greenApple;

        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 146, 26.90);
        fruits[1] = redApple;

        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 186, 32.80);
        fruits[2] = banana;

        Fruit lemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 246, 34.90);
        fruits[3] = lemon;

        System.out.println("All Fruits: " + Arrays.toString(fruits));

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Green apple price: " + decimalFormat.format(greenApple.calculatePrice()));
        System.out.println("Red apple price: " + decimalFormat.format(redApple.calculatePrice()));
        System.out.println("Banana price: " + decimalFormat.format(banana.calculatePrice()));
        System.out.println("Lemon price: " + decimalFormat.format(lemon.calculatePrice()));


    }

}




















