package basics;

public class SwitchCase {

	public static void main(String[] args) {
    
		int x=4;
		System.out.println("x: "+x);
		switch(x) {
			case 0:
				System.out.println("zero");
				break;	
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default:
				System.out.println("more than two");
				break;
		}
		
	}

}

