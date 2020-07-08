package numbers.manipulation;

import java.util.Arrays;

public class LeanerSearch {

	public static void main(String[] args) {

	int []q = {1,2,3,4,5,6};
	
	int a= 66;
	boolean flag= false;
	
	for(int i=0; i<q.length;i++) {
		if(q[i]==a) {
			System.out.println("++");
			flag = true;
			break;
		}
	}
	if(flag==false) {
		System.out.println("Element not found");
	}
	
		
	}

}
