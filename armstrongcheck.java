package day2;

import java.util.Scanner;

public class armstrongcheck {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        int originalNumber = number;
	        int result = 0;
	        int digits = String.valueOf(number).length();
	        
	        while (number != 0) {
	            int remainder = number % 10;
	            result += Math.pow(remainder, digits);
	            number /= 10;
	        }
	        
	        if (result == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }
	    }
	}


