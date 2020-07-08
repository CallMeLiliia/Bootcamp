package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapManipulations {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap();
		map.put(1, "apple");
		map.put(2, "Pear");
		map.put(3, "cherry");
		map.put(3, "Tomato");
		
		System.out.println(map.get(3));
		
		System.out.println(map.entrySet());
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey()+"  ");
			System.out.println(entry.getValue());
	
		}
		
		
		
		
	}

}
