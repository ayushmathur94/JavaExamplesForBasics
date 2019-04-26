package interviewPerspectiveQues;

/*An element of array can store water if there are higher bars on left and right. 
 * We can find amount of water to be stored in every element by finding the heights of bars on left and right sides.
 *A Simple Solution is to traverse every array element and find the highest bars on left and right sides. Take the smaller of two heights.  
 *The difference between smaller height and height of current element is the amount of water that can be stored in this array element.
 */

public class TrappingWater {

	static int arr[] = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
	
	static int findWater(int n){
		int left[] = new int[n];
		int right[] = new int[n];
		
		int water=0;
		
		left[0] = arr[0];
		for(int i = 1 ; i < n ; i++){
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		right[n-1] = arr[n-1];
		for(int i = n -2 ; i >=0 ; i --){
			right[i] = Math.max(right[i+1], arr[i]);			
		}
		
		for(int i = 0 ; i<n ; i++){
			water += Math.min(left[i], right[i]) - arr[i];
		}
		
		return water;
	}
  	
	public static void main(String[] args) {
		System.out.println("Maximum water that can be accumulated is " + findWater(arr.length));
	}
}
