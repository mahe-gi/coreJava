package strings;

public class RomanNumberToNumber {
	
	
	
	
	public static void main(String[] args) {
		
		String Rnum ="MCMIV";
		int len = Rnum.length();
		int sum=0;
		for(int i=0;i<len;i++) {
			int current =getValue(Rnum.charAt(i));
			if(i+1<=len) {
				int next =getValue(Rnum.charAt(i+1));
				
				if(current>next) {
					sum +=current;
				}else {
					sum+=(next-current);
					i++;
				}

				
				
			}else {
				sum+=current;
			}
			
			
			
			
		}
		
		
	}
	
	
	

}
