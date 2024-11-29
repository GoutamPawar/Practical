import java .util.Scanner;

class Mode
{
    public static void main(String args[])
    {
        System.out.println("Enter your number:");
         Scanner sc=new Scanner(System.in);
         int A= sc.nextInt();
         
         if(A>0){
           System.out.println("Positive");
         }
          else{
              if(A<0){
              System.out.println("Negative");}
              else{
              System.out.println("Zero");
          } 
          }
         
         
    }
    
    
}