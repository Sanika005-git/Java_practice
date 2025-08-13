//searching an element
import java.util.*;
public class Array2
{
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int A[]={1,3,5,23,5,6,7,12};
       int key;
       System.out.println("enter a key");
       key=scanner.nextInt();
       for(int i=0;i<A.length;i++)
       {
        if (key==A[i])
        {
            System.out.println("element found at:"+i);
            System.exit(0);
        }
       }
       System.out.println("not found");
    }

}