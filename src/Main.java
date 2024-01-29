//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 37;
        System.out.print("Если возраст человека равен " + age + ", то он ");
        if (age < 18) {
            System.out.println("не достиг совершеннолетия, нужно немного подождать.");
        } else {
            System.out.println("совершеннолетний.");
        }
        // Задача 2
        int outdoorTemp = 37;
        System.out.print("На улице " + outdoorTemp + " градусов, ");
        if (age < 5) {
            System.out.println("нужно надеть шапку.");
        } else if (age > 5) {
            System.out.println("можно идти без шапки.");
        } else {
            System.out.println("можно идти без шапки, а можно и одеть...");
            //ладно, ладно, больше я не буду докапываться до условий и буду делать так, как... вижу.
        }
        // Задача 3
        int speed = 37;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed <= 60) { //это ведь называется максимальная допустимая скорость
            System.out.println("можно ездить спокойно.");
        } else {
            System.out.println("придется заплатить штраф.");
        }
        // Задача 4
        int ageForLearning = 37;
        System.out.print("Если возраст человека равен " + ageForLearning + ", то ему нужно ходить ");
        if (ageForLearning < 2) {
            System.out.println("за мамой.");
        } else if (ageForLearning < 7) {
            System.out.println("в детский сад.");
        } else if (ageForLearning < 18) {
            System.out.println("в школу.");
        } else if (ageForLearning < 25) {
            System.out.println("в университет.");
        } else {
            System.out.println("на работу.");
        }
        // Задача 5
        int ageForAttraction = 37; // :)
        System.out.print("Если возраст ребенка равен " + ageForAttraction + ", то ему ");
        if (ageForAttraction < 5) {
            System.out.println("нельзя кататься на аттракционе.");
        } else {
            System.out.print("можно кататься на аттракционе ");
            if (ageForAttraction < 14) {
                System.out.println("в сопровождении взрослого.");
            } else {
                System.out.println("без сопровождения взрослого.");
            }
        }
        // Задача 6
        int trainWaggonCapacityMax = 102;
        int trainWaggonCapacitySit = 60;
        System.out.print("Если возраст человека равен " + ageForLearning + ", то ему нужно ходить ");
        if (ageForLearning < 2) {
            System.out.println("за мамой.");
        } else if (ageForLearning < 7) {
            System.out.println("в детский сад.");
        } else if (ageForLearning < 18) {
            System.out.println("в школу.");
        } else if (ageForLearning < 25) {
            System.out.println("в университет.");
        } else {
            System.out.println("на работу.");
        }
    }

}