package BASIC_PROGRAMS;

public class lcm_2_numbers {
	public static void main(String[] args) {
		int a=12;
		int b=15;
		int lcm=1;
		
		int i;				
		while((i=findFactor(a,b))>1) {
			if(a%i==0 && b%i==0) {
				lcm*=i;
				a/=i;
				b/=i;
			}
			else if(a%i==0) {
				lcm*=i;
				a/=i;
			}
			else {
				lcm*=i;
				b/=i;
			}
		}
			System.out.println("-----------------\nLCM: "+lcm);
	}

	
	private static int findFactor(int a, int b) {
		int n=1;
		
		for(int i=2; i<=a || i<=b; i++) {
			if(a%i!=0 && b%i!=0) {
				continue;
			}
			else {
				n=i;
				break;
			}
			
		}
		System.out.println(a+"\t"+b+"\t|"+n);
		return n;
	}
	
	
}
