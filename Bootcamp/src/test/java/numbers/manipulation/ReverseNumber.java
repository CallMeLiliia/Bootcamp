package numbers.manipulation;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
//Using modulo
		
		int number = 19287;
		int rev=0;
		
		while (number !=0) {
			rev= rev*10+number%10;
			number=number/10;
		}
		System.out.println(rev);
		
// Using String Buffer		
		int a =12345;
		
		StringBuffer st = new StringBuffer(String.valueOf(a));
		 st = st.reverse();
		System.out.println(st);
//Using String Builder with append		
		int b = 593843;
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(b);
		sbl = sbl.reverse();
		System.out.println(sbl);
		
		
	}

	

}
