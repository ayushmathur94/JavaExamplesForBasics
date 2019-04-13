package interviewPerspectiveQues;

/*Get the array and the key.
1.)Create an empty ArrayList
2.)Insert all elements from the array into the list except the specified key
3.)Convert the list back to an array and return it.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllOccElemArr3 {

public static int[] removeElements(int arr[] , int num){
	
	List<Integer> list = new ArrayList<Integer>();
	
	for (int i : arr){
	    if(i != num){
	    	list.add(i);
	    }	
	}
	
	return  list.stream().mapToInt(Integer::intValue).toArray();
}

//stream().mapToInt(Integer::intValue).toArray()

public static void main(String[] args) {
	int[] array = {3,3,3,3,4,4,3,3,5,6,6,7,3,5,3};
	
	int num = 3;
	
	array = removeElements(array, num);
	
	System.out.println(Arrays.toString(array));
}

}
