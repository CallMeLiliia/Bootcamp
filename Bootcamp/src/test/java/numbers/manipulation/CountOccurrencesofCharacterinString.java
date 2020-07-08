package numbers.manipulation;

public class CountOccurrencesofCharacterinString {

	public static void main(String[] args) {

		String str = "Welcome to HAWAII";

		char b[] = str.toCharArray();
		int count = 0;
		boolean flag = false;

		for (char c : b) {
			if (c == 't') {
				count++;
				flag = true;
			}

		}
		if (flag == true) {
			System.out.println(count);
		}

		if (flag == false) {
			System.out.println("String doen't have this character");
		}
		
		
		
		
		
	}

}
