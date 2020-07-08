package numbers.manipulation;

public class CountNumberOfDigitsinANumber {

	public static void main(String[] args) {

		int a = 4454;
		int count=0;
		
		while(a>0) {
			
			a=a/10;
			count++;
			
		}
		System.out.println("Number of digits in a Number is "+count);
		
		
		
		
		
		
		
		
	}

}
