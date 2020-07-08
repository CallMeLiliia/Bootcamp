package numbers.manipulation;

import java.util.HashSet;

public class FindDuplicateElementsinArray {

	public static void main(String[] args) {
		
		HashSet <Integer> l = new HashSet();
		l.add(44);
		l.add(46);
		l.add(47);
		l.add(48);
		l.add(44);
		System.out.println(l);

		int[] a = { 2, 5, 7, 3, 66, 33, 34346, 33, 7 };

		boolean flag = false;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println("Duplicate element is " + a[i]);
					flag = true;
				}

			}
		}
		if (flag == false) {
			System.out.println("Duplicate is not found");
		}

		// HashSet

		HashSet <Integer> langs = new HashSet();

		for (Integer num : a) {

			if (langs.add(num) == false) {
				System.out.println("Found Duplicate Element " + num);
				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("No Duplicates Found");
		}

	}

}
