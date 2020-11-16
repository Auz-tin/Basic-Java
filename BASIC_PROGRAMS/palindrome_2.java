package BASIC_PROGRAMS;

import java.util.Scanner;

public class palindrome_2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the number: ");
		int a=s.nextInt();
		
		int b=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum=(sum*10)+rem;
			a/=10;
		}
		
		if (sum==b) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("NOT palindrome");
		}
	}

}
