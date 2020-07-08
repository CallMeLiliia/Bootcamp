package numbers.manipulation;

import java.util.Arrays;

public class SortElementsinArray {

	public static void main(String[] args) {

		int []a = {4,7,2,71};
		
		System.out.println("Array before sorting  "+Arrays.toString(a));
		
		int n = a.length;
		for(int i=0; i<n-1;i++) {     //number of passes
			
			for(int j=0; j<n-1; j++) { //Iteratation in each pass
				
				if(a[j]>a[j+1]) {
					
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}System.out.println("Array after sorting "+Arrays.toString(a));
		
		
		
		
		
		
	}

}
