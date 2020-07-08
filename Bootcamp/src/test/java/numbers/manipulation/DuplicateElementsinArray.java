package numbers.manipulation;

import java.util.HashSet;

public class DuplicateElementsinArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };

		boolean flag = false;
		boolean f = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flag = true;
				}
			}

		}

		if (flag == true) {
			System.out.println("Duplicate +");
		} else {
			System.out.println("Duplicate -");
		}

		
		
		
		HashSet<Integer> hs = new HashSet();

		for (Integer integer : a) {
			if (hs.add(integer) == false) {
				f = true;
			}
		}

		if (f == true) {
			System.out.println("+++");
		} else {
			System.out.println("---");
		}

	}

}
