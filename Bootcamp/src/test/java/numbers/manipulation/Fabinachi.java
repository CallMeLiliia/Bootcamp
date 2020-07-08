package numbers.manipulation;

import java.util.Arrays;

public class Fabinachi {

	public static void main(String[] args) {

		
//		int n1 = 0, n2=1, nsum =0;
//		
//		for (int i=2 ; i<10; i++) {
//			nsum =n1+n2;
//			System.out.print(" "+nsum);
//			n1=n2;
//			n2=nsum;
//		}
		
		
	
	System.out.println();
	///////////////////////////////////////////
	
	int n = 10, t1 = 0, t2 = 1;
    System.out.print("First " + n + " terms: ");

    for (int i = 1; i <= n; i++)
    {
        System.out.print(t1 + " ");

        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
    }
    
    /////////////////////////////////////////////////////
    
    
    
//    int num [] = new int [6];
//    
//    num[0]=0;
//    num[1]=1;
//    for (int i =2; i<num.length-1;i++) {
//    	
//    	num[i]=num[i]+num[--i];
//    	
//    	
//    }
//    System.out.println(" "+Arrays.toString(num));
//    
}

}
