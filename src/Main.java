public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int yearsOld = 43;
        if (yearsOld >= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + yearsOld + " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temperatureAir = 19;
        if (temperatureAir < 5) {
            System.out.println("На улице " + temperatureAir + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperatureAir+ " градусов, можно идти без шапки.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speedDrive = 58;
        if (speedDrive < 60) {
            System.out.println("Если скорость  " + speedDrive + ", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость  " + speedDrive + ", то придется заплатить штраф.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int yearsOld = 62;
        if (yearsOld < 2) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора спать.");
        } else if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", нужно ходить в детский сад.");
        } else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу.");
        } else if (yearsOld > 18 && yearsOld < 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то нужно ходить в университет.");
        } else if (yearsOld > 24 && yearsOld < 60) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то нужно ходить на работу.");
        } else if (yearsOld >= 60 ) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то он может отдохнуть.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 12;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то нельзя кататься на аттракционе.");
        } else if (ageChild > 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься на аттракционе в сопровождении взрослого.");
        } else if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatsCount = 60;
        int standing = capacity - seatsCount;
        int sittingPeople = 60;
        int standingPeople = 15;
        boolean freeSittingPlaces = seatsCount > sittingPeople;
        boolean freeStandingPlaces = standing > standingPeople;

        if (freeSittingPlaces) {
            System.out.println("Есть свободные сидячие места");
        } else {
            System.out.println("Свободных сидячих мест нет");
        }

        if (freeStandingPlaces) {
            System.out.println("Есть свободные стоячие места");
        } else {
            System.out.println("Свободных стоячих мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 7;
        int two = 11;
        int three = 53;
        if (one > two) {
            if (one > three) {
            System.out.println("Максимальное число " + one);
        } else {
                System.out.println("Максимальное число " + three);
            }
    } else if (two > one) {
            if (two > three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
            }
        }
    }
