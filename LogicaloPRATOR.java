package coreBasics;

public class LogicaloPRATOR {
public static void main(String[] args) {
	
	String RevParkingCamType = "WithSensors" ;
	int RevParkingCamQuant = 10;
	
	/*  && two ampercents called 
	&& means "logical and" means both a and b conditions must be true to execute a certain block of code.
	*/
	
	if (RevParkingCamQuant <=8 && RevParkingCamType.equalsIgnoreCase("withSensors")){
		System.out.println("Reverse Parking Cameras in our inventory are of Sony company.");
	}else {
		System.out.println("There are no Reverse Parking Cameras found in our Inventory");
	}
	
	/*  || two pipe
	  || means "Logical OR"  means either one of the conditions from the two conditions a and b must be true in order 
	  to execute a certain block of code.
	 */

	if (RevParkingCamQuant <=10 || RevParkingCamType.equalsIgnoreCase("WithoutSensors")){
		System.out.println("Reverse parking cameras in our Second Inventory are of JVC company");
		}else {
			System.out.println("There are no JCV cameras in out inventory");

		}
	
	
	
}
	
}
