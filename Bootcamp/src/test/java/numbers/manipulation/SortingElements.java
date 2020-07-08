package numbers.manipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingElements {

	public static void main(String[] args) {

		Integer a[] = {3,64,235,75,23};
		Arrays.parallelSort(a);
		
		Arrays.sort(a,Collections.reverseOrder());
		
		List<Integer> l = Arrays.asList(a); 
		
		
		
	}

}
