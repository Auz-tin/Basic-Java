package BASIC_PROGRAMS;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Duplicate_letters_2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a sentence :");
		String stat=s.nextLine().toLowerCase();
		
		char[] arr1=stat.toCharArray();
		
		LinkedHashMap<Character,Integer> set=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==' ') {
				continue;
			}
			else if(!(set.containsKey(arr1[i]))) {
				set.put(arr1[i], 1);
			}
			else {
				int value=set.get(arr1[i])+1;
				set.put(arr1[i], value);
			}	
		}
		
		for(Entry m:set.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		System.out.print("\nUnique: ");
		for(Entry m:set.entrySet()){
			if(Integer.parseInt(m.getValue().toString())==1) {
				System.out.print(m.getKey());
			}
		}
		
		System.out.print("\nDuplicate: ");
		for(Entry m:set.entrySet()){
			if(Integer.parseInt(m.getValue().toString())>1) {
				System.out.print(m.getKey());
			}
		}
		
	}
}
