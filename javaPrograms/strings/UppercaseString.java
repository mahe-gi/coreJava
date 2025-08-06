package strings;

public class UppercaseString {
	public static void main(String[] args) {
		
//	Convert "Spring Boot" to uppercase.
		
		String s ="Spring Boot";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<'z') {				
				System.out.print((char)(s.charAt(i)-32));
			}else {
				System.out.print((char)(s.charAt(i)));
			}
			
		}
		
//		Convert "REACT JS" to lowercase.
		
		String s1 = "REACT JS";
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='A'&&s1.charAt(i)<'Z') {				
				System.out.print((char)(s1.charAt(i)+32));
			}else {
				System.out.print((char)(s1.charAt(i)));
			}
			
		}
		
	}
	
	

}
