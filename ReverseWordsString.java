package blahblah;

public class ReverseWordsString {

	static String reverseWordsOfString(String string){
		int index = string.length()-1;
		int start ,  end = index + 1 ;
		String result = " " ;
		
		while(index >= 0){
			if(string.charAt(index)== ' ' ){
				start = index + 1 ;
				
				while (start != end)
					result += string.charAt(start++);
				
				result += " ";
				
				end = index ;
				
			}
			index-- ;
			
			}
		
		start = 0 ;
		while (start != end){
			result += string.charAt(start++);
		
		}
		
	
	
		return result;
}
	

	
	
public static void main(String[] args) {
	
	String resultz = "I am a programmer" ;
	
	System.out.println(reverseWordsOfString(resultz));
	
}	
	
	
	
	
}
