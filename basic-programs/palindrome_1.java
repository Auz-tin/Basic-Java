package BASIC_PROGRAMS;

public class palindrome_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="121";
		StringBuffer n=new StringBuffer(str);
		if(n.reverse().toString().equals(str)) 
			System.out.println("palindrome");
		else 
			System.out.println("not a palindrome");
	}
}

