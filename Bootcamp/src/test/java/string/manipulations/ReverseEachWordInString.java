package string.manipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String text = "Made in China";

		String[] words = text.split(" ");
		String reverseText = "";

		for (String string : words) {
			String reveseWord = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				reveseWord = reveseWord + string.charAt(i);
			}

			reverseText = reverseText + reveseWord + " ";

		}
		System.out.println(reverseText);

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(43);
		list.add(56);
		list.add(11);

		int index = list.indexOf(0);
		System.out.println(index);

		int[] a = { 3, 11, 23, 56, 2, 7 };
		int[] b = { 5, 7, 44, 23, 56 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					count++;
					System.out.println(" Numbers are " + a[i]);
				}
			}

		}
		System.out.println(count);
		
		
		int length = a.length+b.length;
		
		
		int []c = new int[length];
		
		int count1=0;
		
		for (int i = 0; i < a.length; i++) {
			
				c[i]=a[i];
				count++;
			
				System.out.println(c[i]);
				
			}
		for (int j = 0; j < b.length; j++) {
			c[count++]=b[j];
			System.out.println(c[j]);
		}
	}

}
