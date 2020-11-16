package basics;

public class SwitchCase {

	public static void main(String[] args) {
    
		int x=4;
		
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
		
		char grade='a';
		
		switch(grade) {
			case 'a':
				System.out.println("Excellent");
				break;	
			case 'b':
				System.out.println("Good");
				break;
			case 'c':
				System.out.println("Average");
				break;
			default:
				System.out.println("fail");
				break;
		}
		
		
		String remarks = "Excellent";

		switch (remarks) {
		case "Excellent":
			System.out.println("A grade");
			break;
		case "Good":
			System.out.println("B grade");
			break;
		case "Average":
			System.out.println("C grade");
			break;
		default:
			System.out.println("fail");
			break;
		}
		
	}

}

