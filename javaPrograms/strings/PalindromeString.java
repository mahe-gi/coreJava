package strings;

public class PalindromeString {
	
	public static boolean Check(String name) {

		for(int i=0;i<name.length()/2;i++) {
			if(name.charAt(i) != name.charAt(name.length()-i-1)) {
				return false;
			};
		}
		return true;
	}
	public static void main(String[] args) {
		String name ="ABA";
		
		System.out.println(Check(name));
	}

}
