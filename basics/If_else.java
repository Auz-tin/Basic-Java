package basics;

public class If_else {

	public static void main(String[] args) {
		
		int n=9;
		// equality
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
		
		int a=15;
		int b=10;
		// greatest of two numbers
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
		// greatest of three numbers
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
		
