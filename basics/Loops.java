package basics;
public class Loops {

    public static void main(String[] args) {
		
    	// for loop
	for(int i=0;i<5;i++) {
		System.out.println(i);
	}
    
    	// while loop
    	int j=0;
    	while(j<10){
    		System.out.println(j);
      		j++;
    	}
		
    	// do-while loop
	int i=0;
	do {
		System.out.println("i: "+i);
		i++;
	}while(i>1);
   }

}
