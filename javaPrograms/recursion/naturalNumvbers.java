package recursion;



//1 to 10
public class naturalNumvbers {

	
	
	public static void naturalNums(int n) {
		
		if(n==11) {
			return;
		}
		System.out.println(n);
		naturalNums(n+1);
		
		
		
	}
	

	
	public static void main(String[] args) {
		
		naturalNums(1);
		
	}
	
}
