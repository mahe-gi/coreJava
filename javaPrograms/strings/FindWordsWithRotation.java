package strings;

public class FindWordsWithRotation {
	
	
	public static void main(String[] args) {
		
		String s ="mahesh";
		
		String s1 = "heshma";
		
		s = s+s;
		
		if(s.contains(s1)) {
			System.out.println("rotate");
		}else {
			System.out.println("not ");
		}
		
		
	}
	
	

}
