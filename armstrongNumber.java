import java.util.Scanner;

/**
 * 38 armstrongNumber
 */
 class armstrongNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("***Welcome to mychecker Armstrong Number***");
    System.out.println("Enter your choice number: ");
    int num = input.nextInt();
    boolean isArmstrongNumber = isArmstrongNumber(num);
    if (isArmstrongNumber) {
        System.out.println("Your number is a Armstrong Number");
    } else {
        System.out.println("Your number is not a Armstrong Number");   
    }
  } 
 
  public static boolean isArmstrongNumber(int num) {
    int noOfDigits = noOfDigits(num);
    int numCopy = num;
    int finalNumber = 0;
    while (num > 0) {
        int lastDigit = num % 10;
        num /= 10;
        finalNumber += pow(lastDigit, noOfDigits);
    }
    return finalNumber == numCopy;
  }
  public static int pow(int num1, int num2) {
    int result = 1;
    int i = 0;
    while (i < num2) {
        result *= num1;
        i++;
    }
    return result;
  }
  public static int noOfDigits(int num) {
    int digit = 0; 
    while (num > 0) {
      digit ++;
      num /= 10;
    }
    return digit;
  }
}