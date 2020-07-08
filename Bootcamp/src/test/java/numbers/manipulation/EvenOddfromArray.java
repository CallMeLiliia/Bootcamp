package numbers.manipulation;

public class EvenOddfromArray {

	public static void main(String[] args) {

		int a []= {2,5,8,5,43,8};
		
		//Extracting even number
		
		System.out.print("Even numbers :");
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print (a[i] +", ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers :");
		for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print (a[i]+", ");
			}
		}
		
		
		
		
		
	}

}
