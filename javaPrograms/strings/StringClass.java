package strings;


public class StringClass {
	public static void main(String[] args) {

//		string literal  -> it stores in string pool area or constant pool area in heap
		String s1 ="Java";
	
//		using new keyword it creates object in heap it creates separate objects 
		
		String s2 = new String("Java");
		
//		printing length of string
		
		System.out.println(s1.length()); //o/p = 4
		
//		accessing individual char in string 
		
		System.out.println(s1.charAt(2)); // o/p = v
		
		
//		to print individual characters separate  J a v a
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		
		
	}
	
	
}

