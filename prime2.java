
import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check if its prime or not");
        int number = sc.nextInt();
        for(int i = 2; i <=(number); i++)
        {
            if (number % i==0){
            System.out.println("false");
           break;
        }
        else{
            System.out.println(true);
            break;
        }
    }
    }
}
