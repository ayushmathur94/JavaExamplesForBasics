package coreBasics;

public class SwitchStatementz {
	/*    Switch Statement
	 *  What a switch statement does is , it test one variable and depending on the value of variable , it gives you
	 *  multiple choices. 
	 *
	 *  
	 *  if vs switch 
	 *  
	 *    int age = 3
	 *    
	 *  if (age == 1){
	 *  sysout("xyz");
	 *  }
	 *  if (age == 2){
	 *  sysout("abc");
	 *  }
	 *  if (age == 3){
	 *  sysout("bcd");
	 *  }
	 *  
	 *   When using "if", for each age value , we have to write separate if statements. 
	 *  
	 *  switch statement  makes it simple.
	 *  
	 */
	
	
	public static void main(String[] args) {
		int carclass = 4; 
		
    switch(carclass)
    {
    case 1: 
     System.out.println("The car is class A segment i.e. A Hatchback");
     break;
     
    case 2:
    	System.out.println("The car is a class B segment i.e. A LUV");
    	break;
    case 3:
    	System.out.println("The car is a class C segment i.e. A MUV");
    	break;
    case 4:
    	System.out.println("The car is a class D segment i.e. A Sedan");
    	break;
    default :
    		System.out.println("No car is there");
    	break;
    }
    
		
	

	
	
	}
}
