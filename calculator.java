  import java.util.Scanner;
  public class calculator  
{
    public static void main(String[] args)
     {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        double num1=scanner.nextDouble();
        System.out.println("enter second number:");
        double num2=scanner.nextDouble();
        System.out.println("enter the operator(+,-,*,/)");
        char operator=scanner.next().charAt(0);
        double result;
        switch (operator){
            case'+' -> {
                result=num1+num2;
                System.out.println("result="+result);
            }
            case '-' -> {
                result=num1-num2;
                System.out.println("result="+result);
            }
            case'*' -> {
                result=num1*num2;
                System.out.println("result="+result);
            }
            case'/' -> {
                result=num1/num2;
                System.out.println("result="+result);
            }
            default -> System.out.println("invalid operation");  
            

        }

        }
        

    }

