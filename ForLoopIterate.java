package coreBasics;

public class ForLoopIterate {

	public static void main(String[] args) {
		
		System.out.println("Hi there!!");
		
		int arrayOne[] = {2,4,6,7,3,8};
		
		int total = 0;
		
		for (int a : arrayOne){
			System.out.println(a);

			
			total += a;
			
		}
		System.out.println("Now calculating total : ");
		System.out.println(total);
		
	}
	
}
