public class Main {
    public static void main(String[] args) {
        System.out.print("Задача 1: ");
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.print("\nЗадача 2: ");
        for (int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.print("\nЗадача 3: ");
        for (int i=0;i<=17;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\nЗадача 4: ");
        for (int i=10;i>=-10;i--){
            System.out.print(i+" ");
        }
        System.out.print("\nЗадача 5: ");
        for (int i=1904;i<=2096;i++){
            boolean isLeapYear = i % 4 == 0 && i % 100 != 0 || i % 400 == 0;
            if (isLeapYear){
                System.out.print(i+" ");
            }
        }
        System.out.print("\nЗадача 6: ");
        for (int i=7;i<=98;i+=7){
            System.out.print(i+" ");
        }
        System.out.print("\nЗадача 7: ");
        for (int i=1;i<=512;i*=2){
            System.out.print(i+" ");
        }
        System.out.print("\nЗадача 8: ");
        int savingsInCentsPerMonth = 29_000_00;
        int savingsInCentsTotal = 0;
        for (int i=1;i<=12;i++){
            savingsInCentsTotal+=savingsInCentsPerMonth;
            System.out.print("\n    Месяц "+i+", сумма накоплений равна "+savingsInCentsTotal/100f+" рублей.");
        }
        System.out.print("\nЗадача 9: ");
        savingsInCentsPerMonth = 29_000_00;
        savingsInCentsTotal = 0;
        float savingsAccountInterestRateAnnual = 0.12f;
        float savingsAccountInterestPerMonth = savingsAccountInterestRateAnnual /12;
        for (int i=1;i<=12;i++){
            savingsInCentsTotal+= (int) (savingsInCentsPerMonth+savingsInCentsTotal*savingsAccountInterestPerMonth);
            System.out.print("\n    Месяц "+i+", сумма накоплений равна "+savingsInCentsTotal/100f+" рублей.");
        }
        System.out.print("\nЗадача 10: ");
        for (int i=1;i<=10;i++){
            System.out.print("\n    2*"+i+"="+(2*i));
        }
    }

}