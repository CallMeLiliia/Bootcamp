package numbers.manipulation;

public class LargestNumber {

	public static void main(String[] args) {

		
		int a=809,b=77,c=7;
		
		int temp =0;
		
		if(a>b && a>c) {
			System.out.println(" Largest number is "+a);
		}else if(b>a && b>c) {
			System.out.println(" Largest number is "+ b);
		}else {
			System.out.println("Largest number is "+c);
		}
		
		
	//Ternary operator        largest = a>b?a:((b>c)?b:c)
		
		int largest = a>b?a:b;
		largest = c>largest? c:largest;
		
		System.out.println("Largest "+ largest);
		
		
	}

}
