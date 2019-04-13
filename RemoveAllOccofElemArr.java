package interviewPerspectiveQues;

import java.util.Arrays;

public class RemoveAllOccofElemArr {
//Approach 1 using Arrays.copyof(arr,index)
	
	
	public static int[] removeElement(int[] arr, int numb){
		
		int index = 0 ;
		
		for (int i = 0 ; i < arr.length ; i++){
			if(arr[i] != numb){
				arr[index++] = arr[i]; 
			}
		}
	
		return Arrays.copyOf(arr, index);
	
	}
	
	public static void main(String[] args){
		int[] array = {1,2,4,4,5,6,7,8,12,4};
		int numb = 4;
	  
		array = removeElement(array, numb);
		System.out.println(Arrays.toString(array));
	}
	
}
