//find maximum element
import java.util.*;
public class Array3
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        
        int A[]={1,2,12,3,4,56,2,9};
        int max=A[0];
        for (int i=0;i<A.length;i++)
        {
            if (A[i]>max)
            {
                max=A[i];
            }
        }
        System.out.println("max no is:"+max );

    }
}