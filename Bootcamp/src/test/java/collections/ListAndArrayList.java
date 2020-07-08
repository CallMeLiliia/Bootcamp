package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Nazim");
		list.add("Natalia");
		list.add("Alla");
		list.add("Bek");
		list.add("Liliia");

		for (int i = list.size(); i <= 10; i++) {
			list.add(i, "Akmal");
		}
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.lastIndexOf("Alla"));
		
		List<Integer> l = Arrays.asList(22,444,223,123)			;
		
	int a=	l.indexOf(22);
	System.out.println("Index of "+a);

		
	}

}
