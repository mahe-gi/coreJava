package strings;

public class StringQuestions {
	
	public static void main(String[] args) {
//		Write Java code to extract "Java" from the string "Learn Java Programming".
		
		String s ="Learn Java Programming";
		String name="Learn";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== name.charAt(0)) {
				for(int j=i;j<i+name.length();j++) {
					System.out.print(s.charAt(j));
				}
				
			}
		}
		
		
		
//		this will give you string from 0 to 5 index
		System.out.println(s.substring(0,5));
		
//		it will return true or false depends on string is there or not in string
		System.out.println(s.endsWith("ing"));
		
//		it will return the starting index of that word
		System.out.println(s.indexOf("ro"));
		

		
	}

}
