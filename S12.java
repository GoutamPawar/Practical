import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character ");
        char c = sc.next().charAt(0);
       
        switch (c) {
      case 'a': 
      case 'A':
      case 'e':
      case 'E':
      case 'i':
      case 'I':
      case 'o':
      case 'O': 
      case 'u':
      case 'U':
      { System.out.println("Is vowel"+c);break;
      }
            default:
                System.out.println("it is not a vowel");
        }
        
    }
}
