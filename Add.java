
import java.util.Scanner;

public class Add {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("enter two numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is;" + sum);
    }
}
