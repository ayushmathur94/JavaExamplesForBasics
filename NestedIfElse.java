package coreBasics;

public class NestedIfElse {

	private static int noofkms = 1600;
	
	public static void main(String[] args) {
		
		if(noofkms > 2000){
			System.out.println("No of kms are less than required to enter category A"); 
		}else {
			System.out.println("No of kms are less , the current value is " + noofkms);
			if (noofkms == 1500){
				System.out.println("Change category to B i.e. 1000 - 1500");
			}else{
				System.out.println("No. of kms are more than category b range");
			}
			
			
		}
		
	}
	
}
