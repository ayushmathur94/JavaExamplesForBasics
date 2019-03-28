package coreBasics;

public class VariableLengthArgument {

	public static void main(String[] args) {
	/* three dots with primitive type variable(integer , double, etc) in method argument means number of variables is not certain. 
	 */
		
		average(1,2,3,4,5,6,7,8,9,10);
	
	}
	
	private static void average(int...number){
		int total = 0;
		for (int x : number){
			total += x;
			
		}
		System.out.println("Sum is : \n" + total );
		
		int average = total/number.length;
		System.out.println("Average is : \n" + average);
		
	
	}
	
}
