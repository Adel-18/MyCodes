package day1;

import java.util.Scanner;

public class sumofnumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n = sc.nextInt();   
	        int sum = 0;
	        int i = 1;
	        
	        while (i <= n) {
	            sum += i;
	            i++;
	        }
	        System.out.println("Sum : " + sum);
	    }
	}



