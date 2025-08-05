package strings;

import java.util.Arrays;

public class StringToArray {
	public static void main(String[] args) {
		
		String name ="Mahesh";
		
		char[] ch = new char[name.length()];
		
		for(int i=0;i<name.length();i++) {
			ch[i]=name.charAt(i);
		}
		
		System.out.println(Arrays.toString(ch));
		
	}
	
	
	
	
}
