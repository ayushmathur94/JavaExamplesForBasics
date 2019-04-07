package interviewPerspectiveQues;

import java.util.Arrays;

public class RemoveDuplicatesUnsortedAray {
	
	public static int removeDuplicatesUnsortedAr(int arries[] , int n){
		if (n == 0 || n == 1){
			return n ;
		}
		
		int j = 0;
		
		for (int i = 0 ; i < n -1 ; i ++){
			if(arries[i] != arries[i+1]){
				arries[j++] = arries[i];
			}
		}
		
		arries[j++] = arries[n-1];
		
		
		return j;
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,1,14,14,9,8,5,5,5,16,12,12,11,9,8};
		int n = array.length;
		
		Arrays.sort(array);
		
		n = removeDuplicatesUnsortedAr(array, n);
		
		for(int i = 0 ; i < n ; i ++){
			System.out.println(array[i] + " ");
		}
		
	}

}
