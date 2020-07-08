package numbers.manipulation;

import java.util.Arrays;

public class MaximumMinimumElementinArray {

	public static void main(String[] args) {

		int[] a = { 3, 67, 245, 7, 453, 2 };

		Arrays.sort(a);
		System.out.println("Max number is " + a[a.length - 1]);
		System.out.println("Min number is " + a[0]);

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {

				max = a[i];

			}
		}
		System.out.println(max);
		
		int min =a[0];
		
		for (int i=1; i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
System.out.println(min);
	}

}
