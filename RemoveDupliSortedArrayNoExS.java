package interviewPerspectiveQues;

public class RemoveDupliSortedArrayNoExS {

	public static int removeDuplicatesWithoutAuxArray(int arr[] , int n){
		if (n == 0 || n == 1){
			return n;
		}
		
		int j = 0  ;
		for(int i = 0 ; i< n -1 ; i++){
			if (arr[i] != arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		
		
		return j;
		
	}	
	
	public static void main(String[] args) {
		int[] array = {11 , 11, 12,14,14,14,15,16,16,17,17,17,17,18,18,19,19,19};
		int n = array.length;
		n = removeDuplicatesWithoutAuxArray(array, n);
		for (int i = 0 ; i < n ; i ++){
			System.out.println(array[i] + " ");
		}
	}
}
