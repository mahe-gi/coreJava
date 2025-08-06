package strings;

import java.util.Arrays;

public class ReverseStringWords {
	public static String reverse(String s) {
		String ans ="";
		
		for(int i=s.length()-1;i>=0;i--) {
			ans+=s.charAt(i);
		}
		
		return ans;
		
		
	}
	
	
	
	
public static void main(String[] args) {
	
	String s ="We are Warriers";
	s+=' ';
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println(count);
	
	String[] arr = new String[count];
	
	int index=0;
	String val="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			arr[index]=val;
			index++;
			val="";
		}else {
			val+=s.charAt(i);
		}
	}
	
	System.out.println(Arrays.toString(arr));
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=reverse(arr[i]);
	}
	
	System.out.println(Arrays.toString(arr));
	
}
	
	

}
