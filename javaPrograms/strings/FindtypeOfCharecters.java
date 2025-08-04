package strings;

public class FindtypeOfCharecters {
	
	public static void main(String[] args) {
		String s = "Mahesh@123";
		int lowerCase =0;
		int UpperCase =0;
		int Digits=0;
		int specialChar =0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='a'&&ch<='z') {
				lowerCase++;
			}else if(ch>='A'&& ch<='Z') {
				UpperCase++;
			}else if(ch>='0'&&ch<='9') {
				Digits++;
			}else {
				specialChar++;
			}
			
		}
		System.out.printf(" lower Case :"+lowerCase+"\n Uppercase:"+UpperCase+"\n Digits:"+Digits+"\n specialchar : "+specialChar);
	}

}
