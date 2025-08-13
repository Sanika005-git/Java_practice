//reverse a no
import java.util.*;

public class Sc3loop
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scanner.nextInt();
        int rev=0,reminder;
        while (n>0)
        {
          reminder=n%10;
          rev=rev*10+reminder;
          n=n/10;   
        }
        System.out.println("reverse a number"+rev);
    }
}