package Trainingcodes;

import java.util.Scanner;

public class Arraycode3{

	public static void main(String[] args) {
		System.out.println("Enter the count of movie house");
		Scanner sc =new Scanner(System.in);
		int mh=sc.nextInt();
		System.out.println("enter the theotre count inside the moviehouse");
	    int thr=sc.nextInt();
	    System.out.println("enter the screen in each theotre");
		int scr = sc.nextInt();
		int arr[][][]=new int [mh][thr][scr];
			for(int i=0;i<arr.length;i++) {
			System.out.println("inside the movie house no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the theotre no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++ ) {
				System.out.println("enter the capacity of screen no:"+(k+1));
				arr[i][j][k]= sc.nextInt();
				}
				}
			}
			System.out.println("______________________________________________");
			for(int i=0;i<arr.length;i++) {
				System.out.println("inside the movie house"+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("inside the theotre no."+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("the fund collected from screen no:"+(k+1));
						int fund = arr[i][j][k] * 350;
						System.out.println(fund);
				
				}
				}
				
			}
		}
}

	


