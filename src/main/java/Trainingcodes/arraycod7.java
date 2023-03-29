package Trainingcodes;

import java.util.Arrays;

public class arraycod7 {

	public static void main(String[] args) {
		int arr1[]= {10,30,25,68,40,15,90,78,144,71,54,8};
		int arr2[]= {10,30,25,18,40,15,90,78,144,71,54,8};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.println("Arrays are not equal");
				System.exit(0);
				}
		}
			System.out.print("Arrays are equal");
	}
		else {
			System.out.println("Arrays are not equal");
			}
		}
}
