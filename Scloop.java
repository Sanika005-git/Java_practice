//display digits of no.
import java.util.*;
public class Scloop
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");

        int reminder;
        
          int n=scanner.nextInt();
        while(n>0)
        {
            reminder=n%10;
            n=n/10;
            System.out.println(reminder);
        }

    }
}