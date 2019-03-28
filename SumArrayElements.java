package coreBasics;

public class SumArrayElements {

	public static void main(String[] args) {
		
		int carArray[] = {1,5,9,6,4,3,2};
		
		int sum = 0 ;
		
		for (int i =0 ; i<carArray.length ; i++){
			sum += carArray[i] ;   
			
			// sum = sum + carArray[i];
			
			/* 0 + 1 = 1 
			 * 1 + 5 = 6
			 * 6 + 9 = 15
			 * 15 + 6 = 21 
			 * 21 + 4 = 25
			 * 25 + 3 = 28
			 * 28 + 2 = 30
			 */
 		}
		System.out.println(sum);
		
	}
	
}
