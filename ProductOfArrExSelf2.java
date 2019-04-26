package interviewPerspectiveQues;

/*Algorithm:
* 1) Construct a temporary array left[] such that left[i] contains product of all elements on left of arr[i] excluding arr[i].
* 2) Construct another temporary array right[] such that right[i] contains product of all elements on on right of arr[i] excluding arr[i].
* 3) To get prod[], multiply left[] and right[].  	
 */

public class ProductOfArrExSelf2 {
	
public static int[] productofExceptSelf(int n, int[] arr){
	
	int[] result = new int[n];
	
	result[n-1] = 1;
	
	for(int i = n -2 ; i>=0; i--){
		result[i] = result[i+1] * arr[i+1];
	}
	
	int left=1;
	
	for(int i = 0 ; i<n; i++){
		result[i]= result[i]*left;
		left = left*arr[i];
		
	}
return result;
}

public static void main(String[] args) {
	int[] arr = {1,2,3,4};
	
	int n = arr.length;
	
	arr = productofExceptSelf(n, arr);
	
	for(int i = 0 ; i<n ; i++){
		System.out.println(arr[i]);
	}
}

	
}
