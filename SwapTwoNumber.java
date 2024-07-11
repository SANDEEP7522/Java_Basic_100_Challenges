import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        System.out.println("  Swaping of two number   ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number A: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter your secound number B: ");
        int secondNumber = input.nextInt();


        int thiredNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thiredNumber;

        System.out.println("Swaping is completed........");
        System.out.println("Enter your number: " + firstNumber );
        System.out.println("Enter your secound number B: " + secondNumber);
    }
}
