package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int[] a = { 100,2, 4, 6, 8, 10 };
		int[] b = { 2, 4, 5, 7, 9 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];

		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}

		System.out.println(Arrays.toString(c));

		Set<Integer> set = new HashSet<Integer>();
		boolean flag = false;

		for (Integer integer : c) {
			if (set.add(integer) == false) {
				System.out.println("We found : " + integer);
				set.remove(integer);
			}
			;
		}
		System.out.println(set);

	}

}
