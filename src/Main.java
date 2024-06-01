public class Main {
    public static void main(String[] args) {
        //System.out.println("Задача 1");
        int[] array1 = new int[]{1, 2, 3};
        float[] array2 = {1.57f, 7.654f, 9.986f};
        String[] array3 = {"Один", "Два", "Три"};

        System.out.println("\nЗадача 2");
        for (int i = 0; i < 3; i++) {
            String separator = (i != array1.length - 1) ? ", " : "\n";
            System.out.print(array1[i] + separator);
        }
        for (int i = 0; i < 3; i++) {
            String separator = (i != array1.length - 1) ? ", " : "\n";
            System.out.print(array2[i] + separator);
        }
        for (int i = 0; i < 3; i++) {
            String separator = (i != array1.length - 1) ? ", " : "\n";
            System.out.print(array3[i] + separator);
        }

        System.out.println("\nЗадача 3");
        for (int i = 2; i >= 0; i--) {
            String separator = (i != 0) ? ", " : "\n";
            System.out.print(array1[i] + separator);
        }
        for (int i = 2; i >= 0; i--) {
            String separator = (i != 0) ? ", " : "\n";
            System.out.print(array2[i] + separator);
        }
        for (int i = 2; i >= 0; i--) {
            String separator = (i != 0) ? ", " : "\n";
            System.out.print(array3[i] + separator);
        }
        System.out.println("\nЗадача 4");
        for (int i=0;i<array1.length;i++) {
            String separator = (i != array1.length - 1) ? ", " : "\n";
            if (array1[i]%2!=0){
                array1[i]++;
            }
            System.out.print(array1[i] + separator);
        }
    }

}