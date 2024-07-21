import java.util.Scanner;

/**
 * 16 positiveNegativeZero
 */
class numberOddOrEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("**********Welcome to my finder number is odd or even**********9");
    System.out.println("Enter your Choice nuumber: ");
    int num = input.nextInt();

    if (num % 2 == 0) {
        System.out.println("Your choice number is Even");
    } else {
        System.out.println("Your choice number is odd");
    }
  }    
}
