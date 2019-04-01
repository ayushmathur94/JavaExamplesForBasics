package blahblah;

public class ReverseWordsStringBuilder {

	public static String ReverseWordsStringBuilder(String st){
		if (st.length() == 0 || st == null){
			return "";
		}
		
		String[] arr = st.split(" ");   // split string into array elements based on spaces
		
		StringBuilder sbuilder = new StringBuilder();
		
		for (int i = arr.length -1 ; i >= 0 ; --i){
			if (!arr.equals("")){
				sbuilder.append(arr[i]).append(" ");
			}
		}
		
		return sbuilder.length() == 0 ? "" : sbuilder.substring(0, sbuilder.length()-1 );
		
	}

	public static void main(String[] args) {
		String string = "I am a coder";
		
	System.out.println(ReverseWordsStringBuilder(string));	
		
	}
	
}

