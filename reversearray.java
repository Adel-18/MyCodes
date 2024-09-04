package day3;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for( i=0;i<n;i++) {	
		 arr[i]=sc.nextInt();	
		}
		for(i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");	
		}// TODO Auto-generated method stub

	}

}
