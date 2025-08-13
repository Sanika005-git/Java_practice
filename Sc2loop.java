//find a number is armstrong or not
//find a number is armstrong or not//a no that is equal to the sum of its own digits each raised to the power of the no of digits
import java.util.*;
public class Sc2loop
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scanner.nextInt();
        int k=String.valueOf(n).length();
        int sum=0;
        int temp=n;//here temp is swapping value of two variables
        while(temp>0)
        {
            int ld=temp%10;
            sum += (int)Math.pow(ld,k);
            temp=temp/10;
        }
        if (n==sum)
        {
            System.out.println("it is an armstrong number");
        }else
        {
            System.out.println("it is  not an armstrong number");

        }
        }


    }
    

        
    
