package strings;

import java.util.Arrays;

public class ToCompareMethodString {
	
	public static void main(String[] args) {
		
		int arr[] = {4,3,2,1};
	
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-i-1;j++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
