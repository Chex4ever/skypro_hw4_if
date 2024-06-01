public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        long sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("%nСумма трат за месяц составила %d рублей", sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            max = i > max ? i : max;
            min = i < min ? i : min;
        }
        System.out.printf("%nМинимальная сумма трат за день составила %d рублей. " +
                "Максимальная сумма трат за день составила %d рублей", min, max);
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        long sum = 0;
        double average = 0d;
        for (int i : arr) {
            sum += i;
        }
        average= (double) sum /arr.length;
        System.out.printf("%nСредняя сумма трат за месяц составила %.2f рублей%n", average);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}