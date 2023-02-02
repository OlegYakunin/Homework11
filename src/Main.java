import java.time.LocalDate;

public class Main {
    public static void main(String[] args) { // Метод main
        task1(); // Объявили метод «задача1»
        task2(); // Объявили метод «задача2»
        task3();
    }
    public static boolean checkLeapYear (int yearCheck) {
        if ((yearCheck % 4 == 0 && yearCheck % 100 != 0) || yearCheck % 400 == 0)
            return true;
        else
            return false;
    }
    public static void checkDevice (int typeOS, int year) {
        System.out.printf("Установите %s версию приложения для %s по ссылке%n",
                checkYear(year), checkOS(typeOS));
    }
    public static String checkOS (int typeOS) {
        if (typeOS == 0) {
            return "iOS";
        } else {
            return "Android";
        }
    }
    public static String checkYear (int year) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > year) {
            return "облегченную";
        } else {
            return "полную";
        }
    }
    public static int calculateDeliveryTime(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        }
        return -1;
    }

    public static void task1() { // Вызвали метод «задача1»
        System.out.println ("Задача 1");
        int year = 2021;
        boolean isLeapYear = checkLeapYear(year);
        if (isLeapYear) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
    }

    public static void task2() {
        System.out.println ("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2022;
        checkDevice (clientOS,clientDeviceYear);
    }
    public static void task3() {
        System.out.println ("Задача 3");
        int deliveryDays  = calculateDeliveryTime(50);
        if (deliveryDays < 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}