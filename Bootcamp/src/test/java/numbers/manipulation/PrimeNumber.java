package numbers.manipulation;

public class PrimeNumber {

	public static void main(String[] args) {
isPrime(13);
		int number =30;
		int count=0;
		
		if(number>1) {
			
			for(int i=1;i<=number;i++) {
				
				if(number%i==0) {
					count++;
				}
										
			}
			if(count==2) {
				System.out.println("This is Prime number");
			}else {
				System.out.println("This is not Prime number");
			
			}
			
		}else {
			System.out.println("Not Prime Number");
		}
	}
		
	
	
	public static boolean isPrime(int num) {
		
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				System.out.println("This is not a prime");
				return false;
			}
		}System.out.println("Prime");
		return true;
		
	}

}
