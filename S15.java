// Online Java Compiler
// Use this editor to write, compile and run your Java code on
import java.util.Scanner;
class S15{
    public static void main(String[]args){
        System.out.println("Enter Year");
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();

        if(yr%100==0 && yr%400==0){
            System.out.println("It is a Leap Year");
        } else if (yr%4==0){
             System.out.println("It is not a leap Year");
         }
         
    }
}