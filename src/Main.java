public class Main {
    public static void main(String[] args) {
        System.out.print("\n>>>>>>>> Задача 1: <<<<<<<<");
        //для всех денежных переменных используем long в копейках
        long savingsPerMonth = 15_000_00;
        long target = 2_459_000_00;
        long savingsTotal = 0;
        int month = 0;
        float savingsInterestRateAnnual = 0.12f;
        float savingsInterestRatePerMonth = savingsInterestRateAnnual / 12;
        while (savingsTotal <= target) {
            month++;
            savingsTotal += (long) (savingsPerMonth + savingsTotal * savingsInterestRatePerMonth);
            System.out.printf("\nМесяц %d, сумма накоплений равна %.2f рублей.", month, savingsTotal / 100d);
        }
        System.out.print("\n\n>>>>>>>> Задача 2: <<<<<<<<\n");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.print("\n\n>>>>>>>> Задача 3: <<<<<<<<");
        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int mortalityRatePer1000 = 8;
        int targetPeriod = 10;
        for (int year = 1; year <= targetPeriod; year++) {
            population += (int) (population * (birthRatePer1000 - mortalityRatePer1000) / 1000f);
            System.out.print("\nГод " + year + ", численность населения составляет " + population);
        }
        System.out.print("\n\n>>>>>>>> Задача 4: <<<<<<<<");
        //для всех денежных переменных используем long в копейках
        long vasiaSavingsAccount = 15_000_00;
        float vasiaInterestRatePerMonth = 0.07f;
        long vasiaTarget = 12_000_000_00;
        month = 0;
        while (vasiaSavingsAccount <= vasiaTarget) {
            month++;
            vasiaSavingsAccount += (long) (vasiaSavingsAccount * vasiaInterestRatePerMonth);
            System.out.printf("\nМесяц %d, накопил %.2f", month, vasiaSavingsAccount / 100d);
        }
        System.out.printf("\nВасилию понадобиться %d месяцев, чтобы накопить %.2f рублей", month, vasiaTarget / 100d);

        System.out.print("\n\n>>>>>>>> Задача 5: <<<<<<<<");
        //для всех денежных переменных используем long в копейках
        vasiaSavingsAccount = 15_000_00;
        vasiaInterestRatePerMonth = 0.07f;
        vasiaTarget = 12_000_000_00;
        month = 0;
        while (vasiaSavingsAccount <= vasiaTarget) {
            month++;
            vasiaSavingsAccount += (long) (vasiaSavingsAccount * vasiaInterestRatePerMonth);
            if (month % 6 == 0) {
                System.out.printf("\nМесяц %d, накопил %.2f", month, vasiaSavingsAccount / 100d);
            }
        }
        System.out.printf("\nВасилию понадобиться %d месяцев, чтобы накопить %.2f рублей", month, vasiaTarget / 100d);

        System.out.print("\n\n>>>>>>>> Задача 6: <<<<<<<<");
        //для всех денежных переменных используем long в копейках
        vasiaSavingsAccount = 15_000_00;
        vasiaInterestRatePerMonth = 0.07f;
        int vasiaTargetPeriod = 9 * 12;
        for (month = 1; month <= vasiaTargetPeriod; month++) {
            vasiaSavingsAccount += (long) (vasiaSavingsAccount * vasiaInterestRatePerMonth);
            if (month % 6 == 0) {
                System.out.printf("\nМесяц %d, накопил %.2f", month, vasiaSavingsAccount / 100d);
            }
        }
        System.out.printf("\nВасилий за 9 лет (108 месяцев) накопит %.2f рублей", vasiaSavingsAccount / 100d);

        System.out.print("\n\n>>>>>>>> Задача 7: <<<<<<<<");
        int firstFridayOfMonth = 3;
        int daysInWeek = 7;
        int daysInMonth = 31;
        for (int dayOfMonth = firstFridayOfMonth; dayOfMonth <= daysInMonth; dayOfMonth += daysInWeek) {
            System.out.printf("\nСегодня пятница, %d-е число. Необходимо подготовить отчет", dayOfMonth);
        }

        System.out.print("\n\n>>>>>>>> Задача 8: <<<<<<<<");
        int currentYear = 2024;
        int cometPeriod = 79;
        int showBeforeYears = 200;
        int showAfterYears = 100;
        int showFromYear = (currentYear - showBeforeYears);
        int showUntilYear = currentYear + showAfterYears;
        //в качестве точки отсчёта находим первый пролёт кометы в заданном периоде, для этого надо
        //поделить начальный год поиска на период кометы, округлить в большую сторону, и вновь умножить на период кометы
        int year = (int) (cometPeriod * Math.ceil(1. * showFromYear / cometPeriod));
        for (; year <= showUntilYear; year += cometPeriod) {
            System.out.print("\n" + year);
        }

    }
}