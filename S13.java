import java.util.Scanner;

class S13 {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
         System.out.println("Enter +,-,*");
        char operation = choose.next().charAt(0);  
        
        if (operation == '+' || operation == '-' || operation == '*') {   
            System.out.println("Enter first number:");
                 int x = choose.nextInt();

            System.out.println("Enter Second number:");
            int b = choose.nextInt();  
            
          switch(operation){
              case '+':System.out.print(x + b);break;
              case '-':System.out.print(x - b);break;
              case '/':System.out.print(x / b);break;
              case '*':System.out.print(x * b);break;
              default:System.out.print("Invalid operator");break;
          }
       
    }
    else{
        System.out.println("Invalid Operation");
    }
    }
}
