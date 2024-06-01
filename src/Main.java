public class Main {
    public static void main(String[] args) {
        System.out.print("Задача 1: ");
        int year = -1600;
        System.out.println(year + (isLeapYear(year) ? " год — високосный год" : " год — невисокосный год"));

        System.out.print("Задача 2: ");
        int clientDeviceOS = -1; // 0 - iOS, 1 - Android
        int clientDeviceYear = -1;
        printRecommendedVersion(clientDeviceOS, clientDeviceYear);

        System.out.print("Задача 3: ");
        int distance = -1; // max 100
        int days = countDeliveryDays(distance); //return -1 if fail
        System.out.println(days >= 0 ? "Потребуется дней: " + days : "Доставки нет");
    }

    public static boolean isLeapYear(int year) {
        return (year > 1584) && (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static void printRecommendedVersion(int os, int year) {
        int recommendedYear = 2024;
        String version = year < recommendedYear ? "облегчённую " : "";
        String osName = "unknown";
        switch (os) {
            case 0 -> osName = "iOs";
            case 1 -> osName = "Android";
        }
        System.out.println("Установите " + version + "версию приложения для " + osName + " по ссылке");
    }

    public static int countDeliveryDays(int distance) {
        int[] deliveryRangesAscending = {20, 60, 100};
        if (distance > deliveryRangesAscending[deliveryRangesAscending.length - 1] || distance < 0)
            return -1;
        else {
            int deliveryTime = 1;
            for (int range : deliveryRangesAscending) {
                if (distance > range) deliveryTime++;
            }
            return deliveryTime;
        }
    }
}