package javaTest;

import java.util.Scanner;

public class JavaTest4 {

	public static void main(String[] args) {
		System.out.println("nenrei・umareを入力");
		
		Scanner scanner = new Scanner(System.in);
		int nenrei = scanner.nextInt();
		int umare = scanner.nextInt();
		
		System.out.println("両方が合う条件なら1を、片方が合う条件か、もしくは両方が合う条件なら2を入力");
		int mode = scanner.nextInt();
		scanner.close();
		
		 if (mode == 1) {
			 if (nenrei == 10 && umare == 2000) {
			 int kakaku = 100;
			 System.out.println(kakaku);
		 }
	        else {
	        	 int kakaku = 500;
	        	 System.out.println(kakaku);
	        } 
		 }
		 else { 
			 if (nenrei == 10 || umare == 2000)
			 {
			 int kakaku = 100;
			 System.out.println(kakaku);
		 } else
	         {
	        	 int kakaku = 500;
	        	 System.out.println(kakaku);
	         }
		 }
		 }  
}

	 			
	


