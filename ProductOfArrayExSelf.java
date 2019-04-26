package interviewPerspectiveQues;

/*Algorithm:
* 1) Construct a temporary array left[] such that left[i] contains product of all elements on left of arr[i] excluding arr[i].
* 2) Construct another temporary array right[] such that right[i] contains product of all elements on on right of arr[i] excluding arr[i].
* 3) To get prod[], multiply left[] and right[].  	
 */

public class ProductOfArrayExSelf {

	public static int[] productExceptSelf(int n , int arr[]){
		
		int[] result = new int[n];
		int[] t1 = new int[n];
		int[] t2 = new int[n];
		
		t1[0] = 1;
		t2[n-1] = 1;
		
		//scan from left to right
		for(int i = 0 ; i < n-1 ; i++){
			t1[i+1] = arr[i] * t1[i];
		}
		
		//scan from right to left
		for(int i = n-1 ; i > 0 ; i --){
			t2[i-1] =   arr[i] * t2[i];
		}
		
		
		// multiply 
		
		for(int i = 0 ; i < n ; i++){
			result[i] = t1[i] * t2[i];
		}
			return result;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int n = arr.length;
		
		arr = productExceptSelf(n, arr);
		
		for(int i=0 ; i < n ; i++){
			System.out.println(arr[i]);
		}
		
	}
	
}
