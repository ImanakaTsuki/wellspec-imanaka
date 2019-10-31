package javaTest;
import java.util.Scanner;

public class JavaTest5 {

	public static void main(String[] args) {
		System.out.println("aを入力");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = 5;
		int count = 0;
		while (a < b) {
             a = a + 1;
             count = count + 1;
        }
        System.out.println("a+1を繰り返した回数は" + count + "回で、aの値は" + a + "です。");
		
		
		scanner.close();
	}
		
}
