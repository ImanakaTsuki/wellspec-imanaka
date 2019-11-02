package Furoku10.java;

import java.util.Scanner;

public class Sub {
		//sub calcyear
	
public static int calcage (int umare) {
	System.out.println("調べたい年を西暦で入力してください：");
	Scanner scanner = new Scanner(System.in);
	int year = scanner.nextInt();
	int nenrei = year - umare ;
	System.out.println("西暦" + year + "年の時、あなたは" + nenrei + "歳です");
	scanner.close();
	return nenrei;
	
}
//sub calcage 

public static int calcyear (int umare) {
	System.out.println("調べたい年齢を入力してください：");
	Scanner scanner = new Scanner(System.in);
	int nenrei = scanner.nextInt();
	int year = nenrei + umare ;
	System.out.println("あなたが" + nenrei + "歳の時は西暦" + year + "年です");
	scanner.close();
	return year;
	
	
}

}