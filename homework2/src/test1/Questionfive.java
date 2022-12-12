package test1;

import java.util.Scanner;

public class Questionfive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Karenin bir kenar uzunlugunu giriniz =");
		
		int kenar = scan.nextInt();
		
		int alan = kenar*kenar ;
		
		int cevre = 4*kenar;
		
		System.out.println("karenin alani =  "+ alan+"  metrekaredir  "+'\n'+"karenin cevresi  "+cevre+"  metredir  ");
	

	}

}
