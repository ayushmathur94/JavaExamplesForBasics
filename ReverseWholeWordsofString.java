package interviewPerspectiveQues;

public class ReverseWholeWordsofString {

	/*static String wordReverse(String fullString){
		int i = fullString.length() - 1;
		return fullString;
	}
	
	public static void main(String[] args) {
		
		String abc = "Test String";
		System.out.println(abc.length()-1);
	}
	*/
	static String wordReverse(String str) 
	{ 
	    int i = str.length() - 1; 
	    int start, end = i + 1; 
	    String result = ""; 
	      
	    while(i >= 0) 
	    { 
	        if(str.charAt(i) == ' ') 
	        { 
	            start = i + 1; 
	            while(start != end) 
	                result += str.charAt(start++); 
	              
	            result += ' '; 
	              
	            end = i; 
	        } 
	        i--; 
	    } 
	      
	    start = 0; 
	    while(start != end) 
	        result += str.charAt(start++); 
	      
	    return result; 
	} 
	  
	// Driver code 
	public static void main(String[] args) 
	{ 
	    String str = "I AM A GEEK"; 
	      ////////////012345678910
	    //lenght wise 1234567891011
		
         System.out.print(wordReverse(str));
	    
	/*   int i = 10;
	    int start , end = i + 1 ;
	    	String result = "";	
	    	
	    while(i >= 0) 
	    { 
	    	System.out.println("Character at index " + i + " is : "+ str.charAt(i));
	        if(str.charAt(i) == ' ') 
	        { 
	        	System.out.println("index is: "+ i);
	            start = i + 1; 
	            System.out.println("starting string index is :" + start);
	            //end = i + 1;
	            System.out.println("here end is :" + end);
	            while(start != end) 
	                result += str.charAt(start++); 
	            System.out.println("result is :"+ result);
	              
	            result += ' '; 
	            System.out.println("final result is :"+ result);  
	            end = i; 
	            System.out.println("after one loop end is " + end);
	        } 
	        i--; 
	        
	        
	    } 
	    
	    start  = 0 ;
	    while (start != end)
	    	result += str.charAt(start++);
	    System.out.println("fin res is " + result);
	    
	/* //   System.out.println("here i is " + i);
	//    System.out.println("printing last obtained rev. string is " + result);
	    start = 0; 
	    System.out.println("char of start :" + str.charAt(start++));
	    System.out.println("end is " + end);
	    while(start != end) 
	        result += str.charAt(start++);
	   // System.out.println("char of start :" + result);
    //    System.out.println("char of start :" + str.charAt(start++));	    
	    
	    System.out.println(result);  */
	*/    
	} 
	} 
	  

