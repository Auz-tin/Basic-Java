package BASIC;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Your name:\t"+name);
		
		System.out.println("\nEnter your age: ");
		String age=sc.next();
		System.out.println("Your age:"+age);
		
		System.out.println("\nEnter your city: ");
		sc.nextLine();
		String city=sc.nextLine();
		System.out.println("Your city:"+city);	
		
		System.out.println("\nEnter your initial: ");
		char inti=sc.next().charAt(0);
		System.out.println("Your inti:"+inti);	
		
		System.out.println("\nEnter your salary: ");
		double sal=sc.nextDouble();
		System.out.println("Your sal:"+sal);	
		
		System.out.println("\ncorrect: ");
		boolean ok=sc.nextBoolean();
		System.out.println(ok);
		
	}
}
