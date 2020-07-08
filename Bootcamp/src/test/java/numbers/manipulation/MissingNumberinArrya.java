package numbers.manipulation;

import java.util.Arrays;

public class MissingNumberinArrya {

	public static void main(String[] args) {

		//Array should not have duplicates
		// Array No need to be sorted order
		//Values should be i range
		
		int a[]= {1,2,4,5,1};
		
		
		
		int sum1=0;
		for (int i=0; i<a.length;i++) {
			sum1+=a[i];
		}
		
		
		int sum2=0;
		for(int i=1; i<=5; i++) {
			sum2+=i;                //
		}
		
		
		int missingNumber=sum2-sum1;
		System.out.println(missingNumber);
		
	}

}
