import java.util.Scanner;
public class operator
{
    public static void main(String[]args)
    {
      Scanner scanner=new Scanner(System.in);
      System.out.println("enter marks of 5 subjects");
      int m1,m2,m3,m4,m5;
      m1=scanner.nextInt();
      m2=scanner.nextInt();
      m3=scanner.nextInt();
      m4=scanner.nextInt();
      m5=scanner.nextInt();
      float percentage=(float)(m1+m2+m3+m4+m5)/500*100;
      System.out.println(percentage); 
      if (percentage>=95)
      {
        System.out.println("grade A");
      }
      else if(percentage>=85) 
      {
        System.out.println("grade B");
      }
      else if(percentage>=75) 
      {
        System.out.println("grade C");
      }
      else if(percentage>=65)
      {
        System.out.println("grade D");
      }
      else if(percentage>=55)
      {
        System.out.println("grade E");
      }
      else
      {
        System.out.println("grade F");
      }
    }
}