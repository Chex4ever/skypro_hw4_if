public class Main {
    public static void main(String[] args) {
        // Я тут не заметил задач, где нужно было бы использовать && и || - я их "потратил" только в последней задаче.
        System.out.print("Задача 1. ");
        int currentAge = 37;
        int adultAge = 18;
        System.out.print("Если возраст человека равен " + currentAge + ", то он ");
        //Тут Вы можете сказать,мол, зачем я вынес это из условия, и, действительно,
        //этот вступительный sout - с одной стороны уменьшает читабельность, и вообще усложняет код,
        //но иначе sout в условии получается слишком широкий и не влезает по ширине :)
        //да и задача так записана, что можно интерпретировать и так.
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
            //Ладно, ладно, больше я не буду дотошничать до условий...
        }

        System.out.print("Задача 3. ");
        int currentSpeed = 37;
        int maxSpeed = 60;
        if (currentSpeed <= maxSpeed) { //это ведь всё так максимальная *допустимая* скорость
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
        }

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
        // Вот решение в стиле "кручу-верчу - оптимизировать хочу!".
        // Тут вроде решается за 2 логических операций.
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
        // Для разнообразия, то же самое только в одну строку
        System.out.println("Задача 7. Способ 3. Наибольшая переменная: "
                + ((one > two) ? ((one > three) ? "one" : "three") : (two > three) ? "two" : "three"));
    }

}