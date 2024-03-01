public class Main {
	public static void main(String[] args) {
		Author authorPelevinViktor = new Author("Виктор", "Пелевин");
		Author authorSlavnikovaOlga = new Author("Ольга", "Славникова");
		Author author3 = new Author("Виктор", "Пелевин");
		Book bookChapaevAndTheVoid = new Book("Чапаев - и пустота", authorPelevinViktor, 1996);
		Book book2017 = new Book("2017", authorSlavnikovaOlga, 2006);
		Book book3 = new Book("Чапаев - и пустота", author3, 1996);

		System.out.println("Проверяем как работает сравнение книг:");
		objectFullInfo(bookChapaevAndTheVoid, book2017, book3);
		System.out.println("book3==book1 is " + (book3 == bookChapaevAndTheVoid));
		System.out.println("book3.equals(book1) is " + book3.equals(bookChapaevAndTheVoid));
		System.out.println("book3.equals(book2) is " + book3.equals(book2017));
		System.out.println();
		System.out.println("Проверяем как работает сравнение авторов:");
		objectFullInfo(authorPelevinViktor, authorSlavnikovaOlga, author3);
		System.out.println("author3==author1 is " + (author3 == authorPelevinViktor));
		System.out.println("author3.equals(author1) is " + author3.equals(authorPelevinViktor));
		System.out.println("author3.equals(author2) is " + author3.equals(authorSlavnikovaOlga));
	}

	public static void objectFullInfo(Object... objectArray) {
		for (Object object : objectArray) {
		System.out.format("%-55s | hash=%-9s | id=%-9s%n"
		, object.toString()
		, Integer.toHexString(object.hashCode())
		, Integer.toHexString(System.identityHashCode(object)));
		}
	}
}