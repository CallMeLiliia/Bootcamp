package string.manipulations;

public class StringManipulat {

	public static void main(String[] args) {

	//////////	
		String a = "Made in Chine";  
		
		String rev=null;
		
		for(int i = a.length()-1; i>=0; i--) {
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);
  /////////		
		String b = "Keep calm and drink tea ";
		
		StringBuffer sb = new StringBuffer(b);
		sb=sb.reverse();
		System.out.println(sb);
		
		
//////////		
		String c = " Welcome to America";
		char[]d = c.toCharArray();
		String e = null;
		
		for(int i =d.length-1; i>=0; i--) {
			e= e+d[i];
		}
		System.out.println(e);
		
	}

}
