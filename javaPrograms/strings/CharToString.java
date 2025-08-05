package strings;

public class CharToString {
	
//	converting char array to string
	public static void main(String[] args) {
		
		char[] arr= {'M','a','h','e','s','h'};
		
		
		String str ="";
		
		for(int i=0;i<arr.length;i++) {
		
			str+=arr[i];
		}
	
		System.out.println(str);
		
		
		
//		same as above code inbuilt method of String
		String s  = String.valueOf(arr);
		System.out.println(s);
		
		
		
	}
	
	

}
