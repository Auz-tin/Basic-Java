package basics;

public class If_else {

	public static void main(String[] args) {
		
		// equality
		int n=9;
		
		if(n==9){
			System.out.println(" n==9 ");
		}
		else if(n==0 || n==1){
			System.out.println(" n is binary ");
		}
		else if( n%2!=0 ){
			System.out.println(" n is odd number ");
		}
		else{
			System.out.println(" n is even number ");
		}
		
		// greatest of two numbers
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
		
		
		// greatest of three numbers
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
		else if( x==y && y==z ){
			System.out.println("All are equal");
		}
		
  }
}
		
