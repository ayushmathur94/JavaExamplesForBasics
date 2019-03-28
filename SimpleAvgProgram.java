package coreBasics;

import java.util.Scanner;

public class SimpleAvgProgram {

	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 int average ;
		 int total = 0;
		 int grade ;
		 int counter = 0;
		 
		 
		 while(counter < 10){
			 grade = scanner.nextInt();
			 total = total + grade;
			 counter ++;
			 
		 }
		 
		 average = total/10;
		 
		 System.out.println("Average is : " + average);
		 
		 scanner.close();
	}
	
}
