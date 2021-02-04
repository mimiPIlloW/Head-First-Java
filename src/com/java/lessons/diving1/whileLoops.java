package com.java.lessons.diving1;

//Перед началом цикла
//        Внутри цикла
//        Значение x равно 1
//        Внутри цикла
//        Значение x равно 2
//        Внутри цикла
//        Значение x равно 3
//        После окончания цикла

public class whileLoops {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Перед началом цикла");
        System.out.println();
        while (x < 4) {
            System.out.println("Внутри цикла");
            System.out.println("Значение x равно " + x);
            x = x + 1;
        }
        System.out.println();
        System.out.println("После окончания цикла");
    }
}