package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(1);
        name(23,34);
        System.out.println(2);
        name(12,37);
        System.out.println(3);
        name(21,13);
        System.out.println(4);
        name(15,17);
        System.out.println(5);
        name(38,33);
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
}