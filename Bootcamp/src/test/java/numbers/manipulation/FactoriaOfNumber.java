package numbers.manipulation;

public class FactoriaOfNumber {

	
	public static void main(String[] args) {
		
		int a = 7;
		long f =1;
		for (int i=1; i<=a; i++) {
		
			f=f*i;
			
		}
		
		System.out.println(f);
		
		
		int b =6;
		long fu =1;
		
		for(int i=b;i>=1;i--) {
			fu=fu*i;
		}
		System.out.println(fu);
	}
	
}
