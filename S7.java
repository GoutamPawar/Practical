import java.util.Scanner;

public class S7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        if (num1 > num2) {
            System.out.println("The greater number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greater number is: " + num2);
        }
             if (num3>num2){
            System.out.println("The greater number is"+ num3);
            }
         else {
            System.out.println("Both numbers are equal.");
             }
    }
}
    
         
    
        
        
    

