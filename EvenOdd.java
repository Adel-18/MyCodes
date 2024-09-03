package day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("enter a number:");
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
     if(n%2==0) {
    	 System.out.println("even number");
     }
     else {
    	 System.out.println("odd number");
     }
	}

}
