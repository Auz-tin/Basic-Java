package BASIC_PROGRAMS;

public class fibonacci {
	public static void main(String[] args) {
	
		int a=0;
		int b=1;
		int limit=8;
		
		System.out.println(a+"\n"+b+"\n------");
		
		int i=1;
		while(i<=limit) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}
		
	}
}
