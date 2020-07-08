package string.manipulations;

import java.util.Arrays;

public class ReverceWordInString {

	public static void main(String[] args) {

		String str = "Welcome To HAWAII";
		
		String []words = str.split(" "); // Splitting string into wultiple words
		
		String reverseString ="";
		
		for(String w: words) {
			String reverseword="";
			
			for(int i=w.length()-1; i>=0; i--) {
				reverseword+=w.charAt(i);
			} reverseString +=reverseword+" ";
		}
		
		System.out.println(reverseString);
		
		
		
		String str1 = "Made in China";
		String [] words1 = str1.split("\\s");
		String reverseword1 ="";
		for (String string : words1) {
			StringBuilder sb = new StringBuilder(string);
		sb.reverse();
		reverseword1+=sb.toString()+" ";
		
		}
		System.out.println(reverseword1);
		
		
		

		
	}

}
