package BASIC_PROGRAMS;

public class SumOfDigits_1 {

	public static void main(String[] args) {
		
		// odd number add odd places,
		// even number add even places
		
		int[] a=new int[] {986541,583,2,47,14256};
		int[] sums=new int[a.length];
		
		for (int i = 0; i < sums.length; i++) {
			
			String str=Integer.toString(a[i]);
			int j=0;
			
			if(str.length()%2==0 && str.length()>1) {
				j++;
			}
			
			for (; j<str.length(); j=j+2) {
				char ch=str.charAt(j);
				int n=Character.getNumericValue(ch);
				sums[i]+=n;
			}
			
		}
		
		
		for(int i:sums) {
			System.out.println(i);
		}
		System.out.println("--------");
		int sum=0;
		for(int i:sums) {
			sum+=i;
		}	
		System.out.println(sum);
	}
}
