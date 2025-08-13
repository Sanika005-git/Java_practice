//adding two matrices
import java.util.*;
public class 2Darray1
{
    public static void main(String[]args)
    {
        int A[][]={{1,2,3},{3,5,7},{4,5,6}};
        int B[][]={{5,6,7},{3,4,5},{7,8,9}};
        int C[][]=new int[3][3];
        for (int i=0;i<A.length;i++)
        {
            for (int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
                
            }
            System.out.print("")


        }
    }
}