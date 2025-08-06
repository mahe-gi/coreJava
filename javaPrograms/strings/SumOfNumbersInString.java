package strings;

public class SumOfNumbersInString {
	
	public static void main(String[] args) {
		
		String val ="AB23CD7EF";

		int sum=0;
		for(int i=0;i<val.length();i++) {
			
			if(val.charAt(i)>'0' && val.charAt(i)<'9') {
				sum+=val.charAt(i)-48;
			}
			
		}
		
		System.out.println(sum);
		
		
	}

}
