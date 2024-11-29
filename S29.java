import java.util.Scanner;

class S29 {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
         System.out.println("Enter +,>,=");
        char operation = choose.next().charAt(0);  
        
        if (operation =='+') {   
            System.out.println("Enter first number:");
                 int x = choose.nextInt();
            System.out.println("Enter Second number:");
            int b = choose.nextInt();  
            int result= (b+x);
            System.out.println("The result is: " + result);
        }
        else if (operation=='>'){
            System.out.println("Enter first number:");
                 int x = choose.nextInt();
            System.out.println("Enter Second number:");
                 int b = choose.nextInt();  
            boolean result= (b>x);
            System.out.println("The result is: " + result);
            
        }
        else if (operation=='='){
            System.out.println("Enter first number:");
                 int x = choose.nextInt();
            System.out.println("Enter Second number:");
            int b = choose.nextInt();  
            int result= (b=x);
            System.out.println("The result is: " + result);
    } else{
        System.out.println("Invalid number ");
    }
    }
}
       
   
          
          
    
