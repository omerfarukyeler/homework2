package test1;

import java.util.Scanner;

public class QuestionSix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Uzun kenari giriniz =");
		
		int uzunkenar = scan.nextInt();
		
		System.out.println("Kisa kenari giriniz =");
		
		int kısakenar = scan.nextInt();
	
		System.out.println("Yuksekligi giriniz =");
		
		int yukseklik = scan.nextInt() ;
		
		
		
		
		int prizmahacmi = uzunkenar*kısakenar*yukseklik;
		
		System.out.println("prizmanin hacmi   "+ prizmahacmi + "   metrekupdur");
		
		
		
		
		
		
		
		
	}

}
