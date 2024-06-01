public class Main {
    public static void main(String[] args) {
        //hw4-if
        // Я тут не заметил задач, где нужно было бы использовать && и || - я их "потратил" только в последней задаче.
        System.out.print("Задача 1. ");
        int currentAge = 37;
        int adultAge = 18;
        System.out.print("Если возраст человека равен " + currentAge + ", то он ");
        if (currentAge < adultAge) {
            System.out.println("не достиг совершеннолетия, нужно немного подождать.");
        } else {
            System.out.println("совершеннолетний.");
        }

        System.out.print("Задача 2. ");
        int outdoorTemperature = 37;
        int belowIsCriticalToWearHatTemperature = 5; // :)))
        if (outdoorTemperature < belowIsCriticalToWearHatTemperature) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку.");
        } else if (outdoorTemperature > belowIsCriticalToWearHatTemperature) {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице ровно " + belowIsCriticalToWearHatTemperature +
                    " градусов! Идти без шапки, или лучше одеть... Надо посмотреть прогноз...");
        }

        System.out.print("Задача 3. ");
        int currentSpeed = 37;
        int maxSpeed = 60;
        if (currentSpeed <= maxSpeed) {
            System.out.println("Если скорость " + currentSpeed + ", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + currentSpeed + ", то придется заплатить штраф.");
        }

        System.out.print("Задача 4. ");
        int humanAge = 37;
        int newbornAge = 2;
        int babyAge = 7;
        int teenAge = 18;
        int studentAge = 25;
        System.out.print("Если возраст человека равен " + humanAge + ", то ему нужно ходить ");
        if (humanAge < newbornAge) {
            System.out.println("на горшок.");
        } else if (humanAge < babyAge) {
            System.out.println("в детский сад.");
        } else if (humanAge < teenAge) {
            System.out.println("в школу.");
        } else if (humanAge < studentAge) {
            System.out.println("в университет.");
        } else {
            System.out.println("на работу.");
        }

        System.out.print("Задача 5. ");
        int clientAge = 37;
        int prohibitedAge = 5;
        int onlyWithParentAge = 14;
        System.out.print("Если возраст посетителя равен " + clientAge + ", то ему ");
        if (clientAge < prohibitedAge) {
            System.out.println("нельзя кататься на аттракционе.");
        } else if (clientAge < onlyWithParentAge) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого.");
        System.out.print("Задача 6. ");
        int trainWaggonCapacityMax = 102;
        int trainWaggonCapacitySit = 60;
        int passengers = 37;
        if (passengers < trainWaggonCapacitySit) {
            System.out.println("В вагоне осталось " + (trainWaggonCapacitySit - passengers) + " сидячих мест, и "
                    + (trainWaggonCapacityMax - trainWaggonCapacitySit) + " мест для проезда стоя.");
        } else if (passengers < trainWaggonCapacityMax) {
            System.out.println("В вагоне осталось " + (trainWaggonCapacityMax - passengers)
                    + " мест для проезда стоя, все сидячие места заняты.");
        } else {
            System.out.println("Мест нет.");
        }
        System.out.print("Задача 7. ");
        int one = 1;
        int two = 2;
        int three = 3;
        // Вот решение в лоб - наверное самое популярное, но самое медленное.
        // Где-то ж надо было использовать эти && или ||
        // Я так понимаю, что для решения надо выполнить от 3 до 9 логических операций.
        System.out.print("Способ 1. ");
        if (one > two && one > three) {
            System.out.println("Переменная one, равная " + one + ", является наибольшей.");
        } else if (two > one && two > three) {
            System.out.println("Переменная two, равная " + two + ", является наибольшей.");
        } else if (three > one && three > two) {
            System.out.println("Переменная three, равная " + three + ", является наибольшей.");
        } else {
            System.out.println("более одной переменной имеет максимальное значение");
        }
        System.out.print("Задача 7. Способ 2. Наибольшая переменная: ");
        if (one > two) {
            if (one > three) {
                System.out.println("one");
            } else {
                System.out.println("three");
            }
        } else {
            if (two > three) {
                System.out.println("two");
            } else {
                System.out.println("three");
            }
        }
        System.out.println("Задача 7. Способ 3. Наибольшая переменная: "
                + ((one > two) ? ((one > three) ? "one" : "three") : (two > three) ? "two" : "three"));
          
                //next hw
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
        switch (monthNumber){
            case 12,1,2 -> System.out.println("Зима");
            case 3,4,5 -> System.out.println("Весна");
            case 6,7,8 -> System.out.println("Лето");
            case 9,10,11 -> System.out.println("Осень");
            default -> System.out.println("Введите номер месяца согласно григорианскому календарю");
        }
    }

}