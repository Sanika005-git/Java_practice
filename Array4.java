//find second largest element
import java.util.*;
public class Array4
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        
        int A[]={1,4,23,5,8,12,6};
        int max1,max2;
        max1=max2=A[0];
        for (int i=0;i<A.length;i++)
        {
            if (A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("second largest element:"+max2);
    }
        
    }
