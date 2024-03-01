public class Main {
	public static void main(String[] args) {
		Author authorPelevinViktor = new Author("Виктор", "Пелевин");
		Author authorSlavnikovaOlga = new Author("Ольга", "Славникова");

		Book bookChapaevAndTheVoid = new Book("Чапаев - и пустота", authorPelevinViktor, 1996);
		Book book2017 = new Book("2017", authorSlavnikovaOlga, 2017);

		book2017.setYear(2006);

		System.out.println(bookChapaevAndTheVoid);
		System.out.println(book2017);
	}
}