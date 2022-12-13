public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        short clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        short clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short year = 1600;
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        short monthNumber = 12;
        switch (monthNumber) {
            case 1:
                ;
                System.out.println("Данный месяц относится к зимним.");
                break;
            case 2:
                ;
                System.out.println("Данный месяц относится к зимним.");
                break;
            case 3:
                ;
                System.out.println("Данный месяц относится к весенним.");
                break;
            case 4:
                ;
                System.out.println("Данный месяц относится к весенним.");
                break;
            case 5:
                ;
                System.out.println("Данный месяц относится к весенним.");
                break;
            case 6:
                ;
                System.out.println("Данный месяц относится к летним.");
                break;
            case 7:
                ;
                System.out.println("Данный месяц относится к летним.");
                break;
            case 8:
                ;
                System.out.println("Данный месяц относится к летним.");
                break;
            case 9:
                ;
                System.out.println("Данный месяц относится к осенним.");
                break;
            case 10:
                ;
                System.out.println("Данный месяц относится к осенним.");
                break;
            case 11:
                ;
                System.out.println("Данный месяц относится к осенним.");
                break;
            case 12:
                ;
                System.out.println("Данный месяц относится к зимним.");
                break;
        }
    }
}
