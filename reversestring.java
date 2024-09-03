
package day2;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n = sc.nextInt();
		int reverse=0;
		while(n>0) {
			int remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
		System.out.println("Reverse of the number is: "+reverse);
		// TODO Auto-generated method stub

	}

}
