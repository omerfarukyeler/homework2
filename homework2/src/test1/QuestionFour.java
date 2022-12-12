package test1;

import java.util.Scanner;

public class QuestionFour {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter an hour value that you want to convert to seconds=");
		
		long hour = scan.nextLong();
		
		long second = hour*60*60 ;
		
		System.out.println("the time you entered is in seconds   " + second+" sn ");
	
		
		
		
		
		
		

	}

}
