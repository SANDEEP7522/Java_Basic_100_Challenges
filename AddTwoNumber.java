import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        System.out.println("Sum of two numbers");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println( "Sum of given Two number: "+ sum);
    }
}
