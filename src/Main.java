
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
    public static void task1 () {
        System.out.println("Задача1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + " ,то он не совершеннолетний, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача2");
        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature == 5) {
            System.out.println("На улице " + temperature + " градусов, не стоит идти");
        }
    }
    public static void task3 () {
        System.out.println("Задача3");
        int speed = 61;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " , то придётся заплатить штраф");
        }
    }
    public static void task4 () {
        System.out.println("Задача4");
        int man = 60;
        if (man < 2) {
            System.out.println("Если возраст человека " + man + " , то ему пора спать");
        } else if (man >= 2 && man <= 6) {
            System.out.println("Если возраст человека " + man + " , то ему нужно ходить в детский сад");
        } else if (man >= 7 && man <= 18) {
            System.out.println("Если возраст человека " + man + " , то ему нужно ходить в школу");
        } else if (man > 18 && man < 24) {
            System.out.println("Если возраст человека " + man + " , то его место в университете");
        } else if (man > 24 && man < 60) {
            System.out.println("Если возраст человека " + man + " , то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека " + man + " , то он может отдохнуть");
        }
    }
    public static void task5 () {
        System.out.println("Задача5");
        int ageChildren = 13;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то ему нельзя кататься на атракционе");
        } else if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то ему можно кататься на атракционе в сопровождении взрослого");
        } else if (ageChildren >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то ему можно кататься на атракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача6");
        int man = 120;
        int capacityVan = 102;
        int seatsAreSeated = 60;
        int result = capacityVan - man;
        int result2 = seatsAreSeated - man;
        int result3 = capacityVan - seatsAreSeated;
        if (man >= capacityVan) {
            System.out.println("Если в вагоне " + man + " человек, то мест нет");
        } else if (man < capacityVan && man > seatsAreSeated) {
            System.out.println("Если в вагоне " + man + " человек, то осталось " + result + " стоячих мест");
        } else if (man < capacityVan && man < seatsAreSeated) {
            System.out.println("Если в вагоне " + man + " человек, то осталось " + result2 + " сидячих и " + result3 + " стоячих мест");
        } else {
            System.out.println("Если в вагоне " + man + " человек, то осталось " + result + " стоячих мест");
        }
    }
    public static void task7 () {
        System.out.println("Задача7");
        int one = 5;
        int two = 7;
        int three = 1;
        if (one >= two && one >= three) {
            System.out.println("Максимальное число " + one);
        } else if (two > one && two >= three) {
            System.out.println("Максимальное число " + two);
        } else if (three > one && three >= two){
            System.out.println("Максимальное число " + three);
        }
    }
}