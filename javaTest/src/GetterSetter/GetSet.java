package GetterSetter;

import java.util.Scanner;

public class GetSet {

	public static void main(String[] args) {
		System.out.println("モードを選択してください。（1or2):");
		Scanner scanner = new Scanner(System.in);
		int mode = scanner.nextInt();
		System.out.println("生まれた年を西暦で入力して下さい");
		int u = scanner.nextInt();
		Nensu.setUmare(u);
		

		while (mode != 1) {
			if (mode != 2) {
				System.out.println("モードを選択してください。（1or2):");
				mode = scanner.nextInt();
			} else {
				break;
			}
		}
		if (mode == 1) {
			Sub s1 = new Sub();
			Sub.calcage();
		} else {
			Sub s2 = new Sub();
			Sub.calcyear();
		}
		scanner.close();
	}

}
