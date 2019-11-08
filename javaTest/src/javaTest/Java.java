package javaTest;
import java.util.Scanner;

public class Java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("値を入力");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = a + b;

		System.out.println(c);

		c = c + 1;

		System.out.println(c);
		scanner.close();
	}

}
