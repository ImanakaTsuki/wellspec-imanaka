package Furoku10V2;

import java.util.Scanner;

public class Sub {
		//sub calcyear
	
public static void calcage () {
	System.out.println("調べたい年を西暦で入力してください：");
	Scanner scanner = new Scanner(System.in);
	Nensu.year = scanner.nextInt();
	Nensu.nenrei = Nensu.year - Nensu.umare ;
	System.out.println("西暦" + Nensu.year + "年の時、あなたは" + Nensu.nenrei + "歳です");
	scanner.close();
	
}
//sub calcage 

public static void calcyear () {
	System.out.println("調べたい年齢を入力してください：");
	Scanner scanner = new Scanner(System.in);
	Nensu.nenrei = scanner.nextInt();
	Nensu.year = Nensu.nenrei + Nensu.umare ;
	System.out.println("あなたが" + Nensu.nenrei + "歳の時は西暦" + Nensu.year + "年です");
	scanner.close();
	
	
}



}