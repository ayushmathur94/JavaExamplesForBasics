package coreBasics;

public class IntoToArrays {
	
	public static void main(String[] args) {
		
	/*	int array1[] =  new int[10];
		
		array1[1] = 10;
		array1[2] = 9;
		array1[3] = 8;
		array1[4] = 7;
		array1[0] = 11;
		array1[9] = 13;
		
		System.out.println(array1[9]);*/
	
		// Alternate way to declate an array
		
		int array2[] = {10, 20,30,40,45,55,60};
		
		System.out.println(array2[6]);
		
		System.out.println(array2[7]); //gives error
		
		/* Index starts from 0 , so we have to take 0 also while operating on array. Otherwise it will give array 
		 * index out of bounds exception
		 * 
		 */

		/*for (int i = 0 ; i < array2.length ; i++){
			System.out.println(i + "\t" + array2[i]);
		}*/
		
		
	}

	
}
