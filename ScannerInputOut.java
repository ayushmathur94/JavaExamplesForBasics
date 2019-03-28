package coreBasics;

import java.util.Scanner;

public class ScannerInputOut {

	public static void main(String args[]){
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//System.out.println(scanner.nextLine());
		
		double output , firstNum, secondNum ; 
		 System.out.println("Enter the First Number : " );
		firstNum = scanner.nextDouble();
	   
	    
	    System.out.println("Enter the Second Number  : " );
	    secondNum = scanner.nextDouble();
	    
	    
System.out.println("output is : " );
	    output = firstNum + secondNum;
	    
	    System.out.println(output);
		
	}
	
	
}
