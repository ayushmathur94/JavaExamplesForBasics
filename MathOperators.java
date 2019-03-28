package coreBasics;

public class MathOperators {

	public static void main(String[] args) {
		 int apples , oranges , banana , fruits ;
		 
		 apples = 5;
		 oranges = 6 ;
		 banana = 1;
		 
		 fruits = apples + oranges + banana;
		 System.out.println("There are " + fruits + " fruits in the bakset." );
		 
		if (banana > oranges){ 
		fruits = apples - oranges ;
		System.out.println("Blah Blah logic fruits" + fruits);
		}else {
			fruits = oranges - apples ;
		System.out.println("Banana quantity is 1 and extra oranges quantity is (oranges-apples): " + fruits);	
		}
		
		if (apples == oranges){
			fruits = apples * oranges ;
			System.out.println("Not satisfying condition " + fruits);
		}else{
			fruits = apples * oranges * banana ;
			System.out.println("Multiplying all types of fruits in the basket , we get : " + fruits);
		}
		
		if(apples == 7){
			fruits = apples / banana ;
			System.out.println("Not satisfying condition" + fruits);
			}
		else if (oranges == 8) { 
			fruits = oranges / apples / banana;   // (6/5/1 | 6/5 = 1 | 1/1 = 1 | "/" division output is quotient)
			System.out.println("On division of fruits in basket , we get " + fruits );	
		}
		else{
			fruits = oranges % apples ;  // ( oranges % apples = 6%5 i.e.= 1 , oranges%apples%banana = 6%5%1 i.e. => 1%1 = 0 )
			System.out.println("On Modulous, remainder is : " + fruits);
		}
		
		
	}
	
}
