package numbers.manipulation;

public class SumofElementsinArray {

	public static void main(String[] args) {

		
		int a [] = {1,1,1,1,1};
		int sum=0;
		
		for(int i =0; i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
		int s=0;
		
		for (int i : a) {
			s+=i;
		}System.out.println(s);
		
		
	}

}
