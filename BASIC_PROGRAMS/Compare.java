package BASIC_PROGRAMS;

public class Compare {

	public static void main(String[] args) {
		
		// Number of similarities in s as s1
		
		String s="entertainment english entity";
		
		String s1="en";
		
		int count=0;
		
		
		while(s.indexOf(s1)>=0){
			count++;
			System.out.println(s+": "+s.indexOf(s1));
			s=s.substring(s.indexOf(s1)+s1.length());
		}
		
		System.out.println("count: "+count);

	}

}
