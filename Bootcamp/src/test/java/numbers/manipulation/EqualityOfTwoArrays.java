package numbers.manipulation;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 77, 4, 24, 745 };

		int[] b = { 20, 4, 6, 77, 4, 24, 745 };

		boolean status = Arrays.equals(a, b);
		if (status == true) {
			System.out.println("They are =");
		} else {
			System.out.println("They are not =");
		}

		boolean status1 = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					status = false;

				}
			}

		} else {
			status = true;
		}
		if(status ==false) {
			System.out.println(" Do NOT =");
		}else {
			System.out.println("Do =");
		}
		

	}

}
