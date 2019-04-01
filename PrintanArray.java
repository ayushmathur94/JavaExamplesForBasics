package blahblah;

public class PrintanArray {
	
	public static void main(String[] args) {
		String s = "yeh jo desh h mera";
		String[] arr = s.split(" ");
		for (int i = 0; i <= arr.length - 1; i++) 
		System.out.println(i + "\t" + arr[i]);
		
		/* output - 
		 * 0  yeh 
		 * 1  jo
		 * 2  desh
		 * 3  h
		 * 4  mera
		 */
		
		int myintarr[] = {1 ,2, 3, 5, 56, 78, 353, 456};
		for (int i= 0 ; i <= myintarr.length - 1 ; i++){
			System.out.println(i + "\t" + myintarr[i]);
			
		
		/* 
		 * 	
		 */
	}
	
	}
}
