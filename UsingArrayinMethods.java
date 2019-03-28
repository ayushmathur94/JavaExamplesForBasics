package coreBasics;

public class UsingArrayinMethods {

	public static void main(String[] args) {
		int mainArray[] = {1,3,5,7,9,8};
	
		System.out.println("Original array is :");
		for(int b : mainArray){
			System.out.println(b);
		}
		
		
	 UsingArrayinMethods classObject = new UsingArrayinMethods();	
		classObject.changeinArray(mainArray);
		
		System.out.println("New Array is after manipulation is : " );
		for(int a : mainArray){
			
			System.out.println(a);
		}
		
	}
	
	public void changeinArray(int x[]){
		for(int i = 0; i < x.length ; i++){
			x[i] += 5;
		}
		
		
		/* Multi dimensional Array 
		 *   
		 *   int multidArray[][] = {{2,4,6,8,9}, {1,3,5,7,8}};
		 *   
		 *   int arraymultid[][] = {{1,2,3,4}, {45} , {4,6,9,18,23}}
		 *   
		 *  
 		 */
		
		
	}
	
	
}
