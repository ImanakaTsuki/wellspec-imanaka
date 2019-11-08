package javaTest;
import java.util.Scanner;

public class JavaTest3 {

	public static void main(String[] args) {
		System.out.println("nenreiを入力");
		Scanner scanner = new Scanner(System.in);
		int nenrei = scanner.nextInt();
		int kakaku = 0;
		 if (nenrei >= 16) {
			 kakaku = 500;
	        }
	        else {
	        	 kakaku=300;
	        }
		 System.out.println(kakaku);
		scanner.close();
	}

}
