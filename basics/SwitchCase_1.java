  
package basics;

public class SwitchCase_1 {

	public static void main(String[] args) {
    
    char grade = 'f';
    // a or b considered as Execellent
    // c or d considered as Good
		switch (grade) {
      case 'a':
      case 'b':
        System.out.println("Excellent");
        break;

      case 'c':
      case 'd':
        System.out.println("Good");
        break;

      case 'e':
        System.out.println("Average");
        break;

      default:
        System.out.println("fail");
        break;
		}
    
    
    int x = 2;
    // if don't use break print all values after the matched one. (for x=2 output: 2,3,4,5,..n)
		switch (x) {
      case 0:
        System.out.print("0, ");
      case 1:
        System.out.print("1, ");
      case 2:
        System.out.print("2, ");
      case 3:
        System.out.print("3, ");
      case 4:
        System.out.print("4, ");
      case 5:
        System.out.print("5, ");
      default:
        System.out.print("..n");
		}
  }
}
