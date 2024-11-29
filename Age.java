import java.util.Scanner;

class Age
{
public static void main (String []args)
{
System.out.print("Enter your Age:");

Scanner sc= new Scanner(System.in);
      int a= sc.nextInt();
      
      if(a>18 && a<25)
{
System.out.println("Adult");
}
else if(a>25 && a<40)
{
System.out.println("Young");
}
else if(a>40 && a<70)
{
System.out.println("old");
}
else if(a>80 && a<100)
{
System.out.println("Oldest");
}

}
}
