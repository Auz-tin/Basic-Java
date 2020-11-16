package BASIC_PROGRAMS;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int a=s.nextInt();
		
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum=sum+rem;
			a/=10;
		}

		System.out.println(sum);

	}
}
