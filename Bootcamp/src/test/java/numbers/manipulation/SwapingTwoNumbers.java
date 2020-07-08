package numbers.manipulation;

public class SwapingTwoNumbers {

	public static void main(String[] args) {

	//Third variable	
		int num1 = 111;
		int num2 = 222;
		
		int temp;
		 
		 temp = num1;
		num1=num2;
		num2=temp;
		
		System.out.println(" Num1 "+num1+ " Num2"+num2);
		
	// use + &- without third variable	
		int n1 = 333;
		int n2 = 444;
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("Number 1 "+n1+" Number 2 "+ n2);
		
		int no1=55, no2 =66 ;
	// Use * & / without third variable	
		no1=no1*no2;
		no2=no1/no2;
		no1=no1/no2;
		
		System.out.println("No 1 "+ no1+ " No2 "+no2);
		
	//	bitwise XOR (^)
		int number1 =7777, number2 =8888;
		
		number1 = number1^number2;
		number2 = number1^number2;
		number1 = number1^number2;
		
		// 
		int a=10, b=20;
		
		b=a+b-(a=b);
		System.out.println("a "+ a+ "b "+b);
		
		
	
		

		
		
	}

}
