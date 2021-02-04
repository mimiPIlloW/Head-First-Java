package com.java.lessons.diving1;

public class PhraseCMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-эвенный",
                "30000-футовый", "взаимный", "обсадный выигрыш", "фронтэнд",
                "на основе веб-технологий", "проникающий", "умный", "шесть",
                "сити", "метод критического пути", "динамичный" };

        String[] wordListTwo = {"уполномоченный", "трудный",
                "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный",
                "нестандартный ум", "позиционированный", "сетевсй",
                "сфокусированный", "использованный с выгодой", "выровненньй",
                "нацеленный на", "общий", "совместный", "ускореный" };

        String[] wordListThree = {"процесс", "пункт разгрузки",
                "выход из положения", "тип структуры", "талант", "подход",
                "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования" };

        // Вычисляем, сколько слов в каждом списке
        int onelength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем случайные числа
        int randl = (int) (Math.random () * onelength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Строим фразу
        String phrase = wordListOne[randl] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        //выводим фразу
        System.out.println("Bce, что нам нужно, - это " + phrase);
    }
}
