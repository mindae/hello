package hello;

public class Main {
	public static void main(String... args) {
		SalesData data = new SalesData();
		data.display();
		displayGreeting();
		data.display();

	}

	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE");
		System.out.println("THIS APP SHOWS SALES DATA");
		System.out.println("Woot, push worked!");
		System.out.println("test 1");
		System.out.println("test 2");
		System.out.println("new branch test1");
	}
}
