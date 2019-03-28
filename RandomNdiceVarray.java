package coreBasics;

import java.util.Random;

public class RandomNdiceVarray {

public static void main(String[] args) {
	Random dice = new Random();
	
	int arrayToBe[] = new int[7];
	
	for(int roll =1 ; roll<1000 ; roll++){
		++arrayToBe[1+ dice.nextInt(6)] ;
	}
	
	System.out.println("Face\tFrequency");
 for (int face = 1 ; face<arrayToBe.length ; face++ ){
	 System.out.println(face + "\t" + arrayToBe[face]);
 }
	
}	

}
