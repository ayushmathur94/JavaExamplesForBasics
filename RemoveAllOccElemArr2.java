package interviewPerspectiveQues;

import java.util.Arrays;

/*
 * Using Java 8 Stream:
1.Get the array and the key.
2.Filter all element of list which is equal to given key
3.Convert the list back to an array and return it.
*/

public class RemoveAllOccElemArr2 {

	public static int[] removeElements(int arr[] , int num){
		
		return Arrays.stream(arr).filter(val -> val != num).toArray();
		
	}
    //Driver code 
	public static void main(String[] args) {
	
		int[] array = {3, 9, 2, 3, 1, 7, 19, 3, 6, 2, 3, 9};
		int num = 3;
		
		array = removeElements(array, num);
		
		System.out.println(Arrays.toString(array));
		
	}
	
}
