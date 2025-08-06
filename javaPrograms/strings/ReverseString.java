package strings;


public class ReverseString {
	
	
	public static void main(String[] args) {
		
		
		String s1 = "Mahesh";
		String s ="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			s+=s1.charAt(i);
		}
		System.out.println(s);
		

	
	
//	Palindrome number 
	if(s1.equals(s)) {
		System.out.println("palandrome");
	}else {
		System.out.println("Not palandrome");
	}
	}

}
