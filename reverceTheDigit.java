import java.util.Scanner;

/**
 * 35 reverceTheDigit
 */
 class reverceTheDigit {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("*****Welcome to the Reverce Program*****");
          System.out.println("Enter Oyur choice number: ");
          int num = input.nextInt();
         
          int reverse = reverse(num);
          System.out.println("Your reverce number is: " + reverse);
    }
 public static int reverse(int num) {
    int newNum = 0; 
    while (num > 0) {
        int digit = num % 10;
        newNum = newNum * 10 + digit;
        num = num / 10;
    }
    return newNum;
 } 
}
