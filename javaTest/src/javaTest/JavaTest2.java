package javaTest;

public class JavaTest2 {

	public static void main(String[] args) {
		System.out.println("年齢を入力");
		int nenrei = new java.util.Scanner(System.in).nextInt();
		if (nenrei == 0) {
			int kakaku = 100;
			System.out.println("価格は" + kakaku + "円");
		} else {
			int kakaku = 500;
			System.out.println("年齢を入力");
			System.out.println("価格は" + kakaku + "円");
		}
	}

}
