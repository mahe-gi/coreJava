package strings;

public class LoweCaseToUppercase {
	
	public static void main(String[] args) {
		String s ="Ch Mahesh";
		String copy = "";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				
				System.out.print((char)(s.charAt(i)-32));
				copy = copy+(char)(s.charAt(i)-32);
				
			}else {
			
				System.out.print((char)(s.charAt(i)));
				copy = copy+((char)(s.charAt(i)));
			}
			
		}
		System.out.println(copy);
		
		
		String s3 ="Mahesh";
//		non static methods in Stiring class
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		
	}
	
	
	

}
