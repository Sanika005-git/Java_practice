import java.util.*;
public class reverse


{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();
        int m=n;
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if (rev==m)
        System.out.println("it is a palidrome");
        else
        System.out.println("it is not a palidrome");
    }
}

