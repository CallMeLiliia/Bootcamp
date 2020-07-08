package string.manipulations;

public class ReverceString {

	public static void main(String[] args) {

		// 1) Using string contatination operator

		String text = "Made in China";
		String rev = null;

		int lenght = text.length();

		for (int i = lenght - 1; i >= 0; i--) {

			rev = rev + text.charAt(i);

		}
		System.out.println(rev);

		// 2) Using character array

		char a[] = text.toCharArray();
		String rev1 = null;

		for (int i = a.length - 1; i >= 0; i--) {
			rev1 += a[i];
		}
		System.out.println(rev1);

		// Using String Buffer class

		StringBuffer btext = new StringBuffer(text);

		System.out.println(btext.reverse());

	}

}
