import java.util.Scanner;
class S14{
    public static void main (String[]args){
        Scanner num=new Scanner(System.in);

    System.out.println("Enter first number");
          int a= num.nextInt();
    System.out.println("Enter second number");
          int b= num.nextInt();
    System.out.println("Enter third number");
          int c= num.nextInt();
    System.out.println("Enter fourth number");
          int d = num.nextInt();                                                     
          
          if (a < b && a<c && a<d) {
            System.out.print("lowest number is "+a);
       } 
       else if(b<c &&b<d){
             System.out.print("lowest number is "+b);
       } 
       else if (c<d){
           System.out.print("lowest number is "+c);
       }
        else {
             System.out.print("lowest number is "+d);
        }      
          }
}
        
        
    
import java.util.Scanner;
class S