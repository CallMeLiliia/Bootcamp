package numbers.manipulation;

import java.util.Scanner;

public class CountOddEvenNumbers {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
			
		System.out.println("Please enter your number ");
		int number = sc.nextInt();
		int odd=0;
		int even=0;
		int remainder =0;
						
		while(number>0) {
		
			remainder = number%10;
			
			if(remainder%2==0) {
				even++;
			}else {
				odd++;
			}
			number = number/10;
		}
		System.out.println(" contains  Even numbers: "+even+" and odd numbers: "+odd);
		
	}

}
