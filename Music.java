package com.example;

import java.util.function.Supplier;

// Функциональный интерфейс для музыкантов
@FunctionalInterface
interface Musician {
    String getInfo();
}

// Функциональный интерфейс для альбомов
@FunctionalInterface
interface Album {
    String getInfo();
}

// Главный класс Application
public class Music {
    public static void main(String[] args) {
        Music app = new Music();
        app.run();
    }

    public void run() {
        // Использование лямбда-выражений для создания объекта музыканта
        Musician musician1 = () -> "Музыкант:\n" +
                "ФИО: Фредерик Шопен\n" +
                "Псевдоним: Шопен\n" +
                "Дата рождения: 01.03.1810\n" +
                "Страна: Польша";

        Album album1 = () -> "Альбом:\n" +
                "Название: Nocturnes\n" +
                "Год выхода: 1841\n" +
                "Количество композиций: 21";

        // Вывод информации о музыканте
        System.out.println(musician1.getInfo());

        // Вывод информации об альбоме
        System.out.println("\n" + album1.getInfo());
    }
}