package strings;

import java.util.Arrays;

public class ReverseWordsUsingSplit {
	
	public static String reverse(String s) {
		
		String val="";
		
		for(int i=s.length()-1;i>=0;i--) {
			val+=s.charAt(i);
		}
		return val;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		String s = "i Am Millionaire";
		String[] a = s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=reverse(a[i]);
		}
		System.out.println(Arrays.toString(a));
		
//		String ans ="";
//		for(int i=0;i<a.length;i++) {
//			
//			
//			if(i!=a.length-1) {
//				ans +=a[i]+" ";			
//						}else {
//							ans+=a[i];
//						}
//			
//		}
		
	}
	
	
	
	

}
