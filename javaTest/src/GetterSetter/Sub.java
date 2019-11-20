package GetterSetter;

import java.util.Scanner;

public class Sub {
		//sub calcyear
	
public static void calcage () {
	System.out.println("調べたい年を西暦で入力してください：");
	Scanner scan = new Scanner(System.in);
	int y = scan.nextInt();
	Nensu.setYear(y);
	int n = Nensu.getYear() - Nensu.getUmare() ;
	Nensu.setNenrei(n);
	System.out.println("西暦" + Nensu.getYear() + "年の時、あなたは" + Nensu.getNenrei() + "歳です");
	scan.close();
	
}
//sub calcage 

public static void calcyear () {
	System.out.println("調べたい年齢を入力してください：");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	Nensu.setNenrei(n);
	int y = Nensu.getNenrei() + Nensu.getUmare();
	Nensu.setYear(y);
	System.out.println("あなたが" + Nensu.getNenrei() + "歳の時は西暦" + Nensu.getYear() + "年です");
	scan.close();
	
	
}



}