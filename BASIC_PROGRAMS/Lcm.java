package BASIC_PROGRAMS;
import java.util.Scanner;

public class lcm {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.print("total elements: ");
		int num=s.nextInt();
		
		System.out.println("\nEnter them");
		int[] a=new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println();
		
		
		int lcm=1;
		int n;				
		while((n=findFactor(a))>1) {
			boolean div=false;
			for (int i = 0; i < a.length; i++) {
				if(a[i]%n==0) {
					a[i]/=n;
					if(!(div)) {
						lcm*=n;
						div=true;
					}
				}
			}
		}
			System.out.println("LCM: "+lcm);
		
		
	}
	
	private static int findFactor(int[] a) {
		int n=1;
		int max=findMax(a);
		for(int i=2; i<=max; i++) {
			boolean div=false; 
			for (int j = 0; j < a.length; j++) {
				if(a[j]%i==0) {
					div=true;
					break;
				}
			}
			if(div) {
				n=i;
				break;
			}
		}
		
		for(int i:a) {
			System.out.printf("%4d", i);
		}
		System.out.println("| "+n);
		
		return n;
	}

	private static int findMax(int[] a) {
		int max=a[0];		
		for(int i:a) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	
}
