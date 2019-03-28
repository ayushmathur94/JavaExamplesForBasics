package coreBasics;

public class DisplayArrayTable {

	public static void main(String[] args) {

		/*  \t means tab ie a space " " between two consecutive words in a string
		 *   
		 *  arrayForMe.length does not consider 0 as length , it only takes counting numbers (without 0) 
		 *  for eg below array length is 6 not 5 
		 */
		
		System.out.println("Index\tValue");
		
		int arrayForMe[] = {10,20,30,40,50,60};
	//	System.out.println(arrayForMe.length);
		
		for (int counter = 0 ; counter < arrayForMe.length ; counter++){
			System.out.println(counter + "\t" + arrayForMe[counter]);
		}
		
	}
	
}

