package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        int [] Accountings = generateRandomArray();

        int sum = 0;
        for (int Accounting : Accountings) {
            sum += Accounting;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2 () {
        int [] Accountings = generateRandomArray();

        int sumMax = 0;
        int sumMin = 0;

        for (int i = 0; i < Accountings.length; i++) {
            if (sumMin > Accountings[i]) {
                sumMin = Accountings[i];
            }
            if (sumMax < Accountings[i]) {
                sumMax = Accountings[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + sumMin + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + sumMax + " рублей");
    }

    public static void task3 () {
        int [] Accountings = generateRandomArray();

        int sum = 0;

        for ( int Accounting : Accountings) {
            sum += Accounting;
        }

        double middle = (double)  sum / Accountings.length;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");
    }

    public static void task4 () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
