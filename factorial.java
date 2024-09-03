package day1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        int factorial = 1;

	        while (num > 0) {
	            factorial *= num;
	           
	        }

	        System.out.println("Factorial is: " + factorial);
	    }
	}