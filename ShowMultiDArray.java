package coreBasics;

public class ShowMultiDArray {
	
	public static void main(String[] args) {
	 int firstArray[][] = {{1,4,6,7,18}, {22,45,64,78,18}};
	 int secondArray[][] = {{2,3,4,5,6,7}, {64} ,{21,24,26,88}};
		
	 System.out.println(secondArray[0].length);
	 System.out.println(secondArray[1].length);
	 System.out.println(secondArray[2].length);
	 // output is : no. of elements in 2nd(index wise) position groupelement. 
	 
	 System.out.println(secondArray.length);  
	 //output is : no. of groupelements in outer curly braces of  multi-D array. ie in this case, 3
	 
	 System.out.println("FirstArray is : ");
	 display(firstArray);
	 
	 System.out.println("SecondArray is : ");
	 display(secondArray);
	 
	 
	}
	
	public static void display(int x[][]){
		for (int row = 0; row < x.length ; row ++)
		{
			for (int column = 0 ; column < x[row].length ; column ++){
				System.out.print(x[row][column]+ "\t");
			}
			System.out.println();
			}
		}

}
