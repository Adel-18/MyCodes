package day3;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for( i=0;i<n;i++) {	
		 arr[i]=sc.nextInt();	
		}
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");	
		}
		System.out.println("\nArray is full");
		
	}

}
