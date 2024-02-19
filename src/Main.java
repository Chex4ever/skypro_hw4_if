public class Main {
    public static void main(String[] args) {
        System.out.print("Задача 1: ");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        //String fullName = lastName + " " + firstName + " " + middleName;
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.print("Ф. И. О. сотрудника - " + fullName);

        System.out.print("\nЗадача 2: ");
        //String fullName = "Ivanov Ivan Ivanovich"
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.print("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullNameUpperCase);

        System.out.print("\nЗадача 3: ");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
    }
}