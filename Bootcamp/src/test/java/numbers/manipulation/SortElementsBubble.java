package numbers.manipulation;

import java.util.Arrays;

public class SortElementsBubble {

	public static void main(String[] args) {

		
		int f[]= {39876,6,30,86,34,653};
		
		for(int i=0;i<f.length; i++) {
			for(int j=i+1; j<f.length;j++) {
				if(f[i]>f[j]) {
					int temp = f[i];
					f[i]=f[j];
					f[j]=temp;
				}
			}
		}System.out.println(Arrays.toString(f));
		
		
	}

}
