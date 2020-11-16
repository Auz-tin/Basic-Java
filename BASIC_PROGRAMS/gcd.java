package BASIC_PROGRAMS;

public class gcd {
	
	public static void main(String[] args) {
		int [] a=new int[] {20,15};
		System.out.println(findGcd(a));		
	}

	private static int findGcd(int[] a) {
		int gcd=1;	
		int min=findMin(a);
	
		for(int n=2;n<=min;n++) {
			boolean div=true;
			for(int i=0;i<a.length;i++) {
				if(a[i]%n!=0) {
					div=false;
					break;
				}
			}
			if(div) {
				gcd=n;
			}
		}
		
		return gcd;	
	}

	private static int findMin(int[] a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
}
