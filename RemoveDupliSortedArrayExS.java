package interviewPerspectiveQues;

public class RemoveDupliSortedArrayExS {

	public static int RemoveDuplicatesOccSpace(int arr[], int n){
		if (n == 0 || n == 1){
			return n;	
		}
//	   System.out.println(n);
		
		int[] temp = new int[n];
		
	int j = 0 ;
		for(int i = 0 ; i < n-1 ; i++){
			if(arr[i] != arr[i+1]){
				
//				System.out.println("Cleared i is : " + i); // 0, 2 ,3,6
//				System.out.println("This is j : " + j);
				
				 temp[j++] =  arr[i]; 

/*				  System.out.println("This is j : " + j);
				 System.out.println("This is temp@0: " + temp[0]);
				 System.out.println("This is temp@1: " + temp[1]);
				 System.out.println("This is temp@2: " + temp[2]);
				 System.out.println("This is temp@3: " + temp[3]);
				 System.out.println("This is temp@4: " + temp[4]);
				 System.out.println("arrin: " + arr[i]);   */   			 
			}	 	
		}
		
		temp[j++] = arr[n-1];

		//System.out.println("hi there final " + arr[n-1]);
      //System.out.println("having j for final iteration :- " + j);
		
		for(int i =0 ; i<j ; i++){
	    arr[i]	= temp[i]; 
	    
	//	System.out.println(" Resultant array :  " + arr[i]);
		}
//		System.out.println("Having final j is " + j);
		return j;
	}
    	 
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2,3, 4,4,4,5,5};
		int n = arr.length;
		
		n = RemoveDuplicatesOccSpace(arr, n);
		
		for(int i =0 ; i <n ; i++){
			System.out.println(arr[i] + " ");
		}
	}
	
	
}