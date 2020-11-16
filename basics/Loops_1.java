 package basics;
public class Loops_1 {
    // breaks and continue
    public static void main(String[] args) {
		
	for(int i=0;i<5;i++) {
      		if(i==2){
        	break;  // cut the entire loop when i=2
      		}
		System.out.println(i);
	}
    
     	for(int i=0;i<5;i++) {
      		if(i==2){
        	continue;  
        	// cut the particular iteration (i=2), skip code after this line it goes to next iteration (i=3)
      		}
		System.out.println(i);
	}
    	
   }
}
