package test1;

import java.util.Scanner;

public class QuestionThird {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter mile value=" +"(*If you are going to enter a decimal number, please use a comma.)");
		
		double mil = scan.nextDouble();		
				
		double km = mil * 1.6 ;
		
		System.out.println("The value in km of the value you entered ="  + km );
		
		
	
		
		
		

	}

}
