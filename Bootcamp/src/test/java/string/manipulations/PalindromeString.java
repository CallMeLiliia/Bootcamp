package string.manipulations;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String org_str = str;
		
		String rev="";
		
		for(int i = org_str.length()-1; i>=0; i--) {
			rev=rev+org_str.charAt(i);
		}
		
		String result= (org_str.equals(rev))?"This is Palindrome":"This is not Palindrome";
		System.out.println(result);
		
	}

}
