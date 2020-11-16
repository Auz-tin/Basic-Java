package BASIC_PROGRAMS;
import java.util.Scanner;

public class Duplicate_letters_1 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a sentence :");
		String stat=s.nextLine();
		
		char[] arr1=stat.toCharArray();
		
		String newstat=" ";
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
					if(i!=j && arr1[i]==arr1[j] && !(newstat.contains(Character.toString(arr1[j])))) {
						newstat+=arr1[j];
					}
			}
		}
		
		System.out.println(newstat.trim());
	}
}
