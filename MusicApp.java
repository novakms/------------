package com.example;

// Интерфейс для музыкантов
interface Musician {
    String getFullName();
    String getStageName();
    String getBirthdate();
    String getCountry();
}

// Интерфейс для альбомов
interface Album {
    String getTitle();
    int getReleaseYear();
    int getTrackCount();
}

// Главный класс Application
public class MusicApp {
    public static void main(String[] args) {
        MusicApp app = new MusicApp();
        app.run();
    }

    public void run() {
        // Создание анонимного класса для музыканта
        Musician musician1 = new Musician() {
            private String fullName = "Фредерик Шопен";
            private String stageName = "Шопен";
            private String birthdate = "01.03.1810";
            private String country = "Польша";

            @Override
            public String getFullName() {
                return fullName;
            }

            @Override
            public String getStageName() {
                return stageName;
            }

            @Override
            public String getBirthdate() {
                return birthdate;
            }

            @Override
            public String getCountry() {
                return country;
            }
        };

        // Создание анонимного класса для альбома
        Album album1 = new Album() {
            private String title = "Nocturnes";
            private int releaseYear = 1841;
            private int trackCount = 21;

            @Override
            public String getTitle() {
                return title;
            }

            @Override
            public int getReleaseYear() {
                return releaseYear;
            }

            @Override
            public int getTrackCount() {
                return trackCount;
            }
        };

        // Вывод информации о музыканте
        System.out.println("Музыкант:");
        System.out.println("ФИО: " + musician1.getFullName());
        System.out.println("Псевдоним: " + musician1.getStageName());
        System.out.println("Дата рождения: " + musician1.getBirthdate());
        System.out.println("Страна: " + musician1.getCountry());

        // Вывод информации об альбоме
        System.out.println("\nАльбом:");
        System.out.println("Название: " + album1.getTitle());
        System.out.println("Год выхода: " + album1.getReleaseYear());
        System.out.println("Количество композиций: " + album1.getTrackCount());
    }
}