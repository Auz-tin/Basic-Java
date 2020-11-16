package basics;

public class If_else {

	public static void main(String[] args) {
		int a=15;
		int b=10;
		int c=15;
		
		if(a>b && a>c) {
			System.out.println("A1 is greater");
		}
		
		else if(b>a && b>c){
			System.out.println("B is greater");
		}
		
		else if(a==b || b==c || c ==a) {
			if(a==b && b==c) {
					System.out.println("All are equal");
			}
			else if(c==a) {
					System.out.println("A1,C are equal");
			}
			else if(b==c) {
					System.out.println("B,C are equal");
			}
			else {
					System.out.println("A1,B are equal");
			}
		}
		
		else {
			System.out.println("C is greater");
		}
  }
}
		
