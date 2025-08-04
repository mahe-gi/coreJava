package strings;

public class StringEqualsOrNot {

	public static void main(String[] args) {
		
		String s1 = "Mahesh";
		String s2 ="Mahesh1";
		if(s1.length() == s2.length()) {
			
			boolean flag=true;
			
			for(int i=0;i<s1.length();i++) {
				
				if(s1.charAt(i) != s1.charAt(i)) {
					System.out.println("Not equals");
					flag=false;
					break;
				}
				
			}
			if(flag) {
				System.out.println("Equals");
			}
			
		}else {
			System.out.println("Not equals");
		}
		
	}
	
	
}

