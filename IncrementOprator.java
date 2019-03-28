package coreBasics;

public class IncrementOprator {
 
 public static void main(String[] args) {
	 int creta = 11;
		int verna = 10 ;
		
	//	System.out.println(creta ++);
	 
	//	variable ++ will increase value by 1 after declaration (line of code next time variable is being used)
		
		System.out.println(creta);
		
		// if we use increment operator before variable i.e. ++ variable , then 
		
		System.out.println(++ creta);
	// will increase at the time of declatation of ++ 
		
	// ******* Same case with decerement operator --  ******** \\
		
		System.out.println(-- creta);
		
		
		System.out.println("Verna original value is : " + verna);
		
		verna = verna + 6 ;
		System.out.println("After addition (common one), verna value is : " + verna);
		
		verna += 10;
	    System.out.println("After addition with new efficient += : value is :" + verna);
	    
	    verna -= 8;
	    System.out.println("Subtraction using -= :" + verna);
}
	
	

	
	
}
