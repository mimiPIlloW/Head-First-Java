package com.java.lessons.diving1;

public class beerSong {
    public static void main(String[] args) {

        int beerNum = 99;
        String word = "Бутылок";

        while (beerNum > 0) {
            if (beerNum == 1) {
                System.out.println("Бутылка");
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}