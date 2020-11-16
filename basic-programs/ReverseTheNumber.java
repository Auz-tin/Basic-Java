package BASIC_PROGRAMS;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		System.out.println(sum);
	}

}
