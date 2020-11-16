package BASIC_PROGRAMS;

// compare two strings and find number of occurence of String s1 in String s

public class Compare {

	public static void main(String[] args) {
		
		String s="entertainment english entity";
		String s1="en";
		
		int count=0;
		
		while(s.indexOf(s1)>=0){	// .indexOf method returns values (>=0) if String present else return (-1)
			count++;		// if String present increment the value of count
			System.out.println(s+": "+s.indexOf(s1));
			s=s.substring(s.indexOf(s1)+s1.length()); // exclude the part of string which is searched and matched
		}
		
		System.out.println("count: "+count);

	}

}
