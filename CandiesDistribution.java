package interviewPerspectiveQues;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CandiesDistribution {

	private static long candiesDist(int n , int arr[]){
		
		long[] candies = new long[n];
		long distribution = 1l;
		
		candies[0] = distribution;
		
		for(int i = 1 ; i < n ; i++){
			distribution = (arr[i] > arr[i-1] ? distribution + 1 : 1l);
			
			candies[i] = distribution;
		}
		
		for (int i = n - 2 ; i >= 0 ; i --){
			if (arr[i] > arr[i+1] && candies[i] <= candies[i+1]){
				candies[i] = candies[i+1] + 1l;
			}
		}
		
		return Arrays.stream(candies).sum();
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\inputfileforJavaProg\\inputzoo.txt"));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		int[] arry = new int[n];
		for(int i=0 ; i < n ; i++){
			
			arry[i] = Integer.parseInt(br.readLine().trim());
			
		}
		System.out.println(candiesDist(n,arry));
		br.close();
	}
	
}
