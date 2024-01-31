//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1;
        if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для iOS по ссылке");

        //Задача 2
        clientOS = 1;
        int clientDeviceYear = 2015;
        String needLightVersion = ((clientDeviceYear < 2015) ? "облегчённую " : "");
        if (clientOS == 1)
            System.out.println("Установите " + needLightVersion + "версию приложения для Android по ссылке");
        else System.out.println("Установите " + needLightVersion + "версию приложения для iOS по ссылке");

        //Задача 3
        int year = 2021;
        boolean isLeapYear = ((year > 1584) && (year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        System.out.println(year + " год " + (isLeapYear ? "" : "не ") + "является високосным");

        //Задача 4
        int deliveryDistance = 95;
        int[] deliveryRangesAscending = {20, 60, 100};
        if (deliveryDistance > deliveryRangesAscending[deliveryRangesAscending.length - 1])
            System.out.println("Превышено максимальное расстояние, доставки нет");
        else {
            int deliveryTime = 1;
            for (int range : deliveryRangesAscending) {
                if (deliveryDistance > range) deliveryTime++;
                else break;
            }
            System.out.println("Потребуется дней: "+deliveryTime);
        }

        //Задача 5
        int monthNumber = 12;
        switch (monthNumber){//Ну вот, единственное место где можно и нужно использовать % - а по условию нельзя...
            case 12,1,2 -> System.out.println("Зима");
            case 3,4,5 -> System.out.println("Весна");
            case 6,7,8 -> System.out.println("Лето");
            case 9,10,11 -> System.out.println("Осень");
            default -> System.out.println("Введите номер месяца согласно григорианскому календарю");
        }
    }
}