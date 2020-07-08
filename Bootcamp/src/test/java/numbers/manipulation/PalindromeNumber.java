package numbers.manipulation;

public class PalindromeNumber {

	public static void main(String[] args) {

		int a = 1115;
		int rev=0;
		
		while(a!=0) {
			rev = rev*10+a%10;
			a=a/10;
					
		}
		System.out.println(rev);
		String result = (a==rev)? "It is  palindrome number":"It  not Palindrome";
		System.out.println(result);
		
		
		
		
	}

}
