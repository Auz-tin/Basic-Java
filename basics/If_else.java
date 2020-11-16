package basics;

public class If_else {

	public static void main(String[] args) {
		int a=15;
		int b=10;
		
		if(a>b) {
			System.out.println("A is greater");
		}
		
		else if(b>a){
			System.out.println("B is greater");
		}	
		else {
			System.out.println("Both are equal");
		}
		
		int x=10, y=15, z=5;
		
		if(x>y && x>z){
			System.out.println("x is greater");
		}
		
		else if(y>x && y>z){
			System.out.println("y is greater");
		}
		else if(z>x && z>y){
			System.out.println("z is greater");
		}
		else {
			System.out.println("All are equal");
		}
  }
}
		
