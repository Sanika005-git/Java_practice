//check a no is palindrome//palindrome=a no is that reads same forwards or backwords.it remains unchanged when its digit are reversed//ex.121,1331
import java.util.*;
public class Sc4loop
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enetr a number");
        int n=scanner.nextInt();
        int m=n;
        int rev=0,reminder;
        while (n>0)
        {
            reminder=n%10;
            rev=rev*10+reminder;
            n=n/10;
        }
        if (rev==m)
        System.out.println("it is a palindrome no");
        else
        System.out.println("it is not a palindrome no");
    }
}