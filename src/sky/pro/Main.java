package sky.pro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //task 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //task 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //task 4
        int deliveryDistance = 95;
        int timeDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + timeDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (timeDelivery + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (timeDelivery + 2));
        }
        //task 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            case 13:
                System.out.println("Такого месяца не существует");
                break;
        }
        //task 6
        int age = 19;
        int salary = 58_000;
        if (age >= 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей");
        } else if (age < 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей");
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.2) + " рублей");
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.2) + " рублей");
        } else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.5) + " рублей");
        } else if (age < 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.5) + " рублей");
        }



    }
}
