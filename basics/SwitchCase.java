package basics;

public class SwitchCase {

	public static void main(String[] args) {
    
		int x=4;
		System.out.println("x: "+x);
		switch(x) {
			case 0:
			case 1:
				System.out.println("Binary");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
			default:
				System.out.println("default");
				break;
		}
		
	}

}

