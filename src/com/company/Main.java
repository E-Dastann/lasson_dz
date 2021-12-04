package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(1);
        name(23,generateRandomAge());
        System.out.println(2);
        name(12,generateRandomAge());
        System.out.println(3);
        name(21,generateRandomAge());
        System.out.println(4);
        name(15,generateRandomAge());
        System.out.println(5);
        name(38,generateRandomAge());
    }


    public static String name( int temperature , int age   ) {

        if (temperature > 20 && temperature < 40 && age >20 && age <45) {
            System.out.println("можно идти гулять ");
        }
        else  if (age < 20 || temperature > 0 && temperature < 28) {
            System.out.println("можно идти гулять ");
        }
        else if (age>45 || temperature>-10 && temperature<25){
            System.out.println(" можно идти гулять ");
        }
        else {
            System.out.println(" стовайтесь дома");
        }

        return String.valueOf(age+temperature);
    }
    public static int generateRandomAge(){
        final Random random = new Random();
        int randomNumber=random.nextInt(100)+1;
        System.out.println(randomNumber);
        return randomNumber;
    }
}