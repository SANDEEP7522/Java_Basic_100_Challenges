import java.util.Scanner;

/**
 *34 numberIsPrime
 */

 class numberIsPrime {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to My Prime number checker");
    System.out.println("Enter your choice number: ");
    int num = input.nextInt();

    boolean isPrime = isPrime(num);
    if (isPrime) {
        System.out.println("Your number is prime");
    } else {
        System.err.println("Your number is not prime");
    }
    input.close();

   }
   public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }

    int i = 2;
    while (i <= Math.sqrt(num)) {
        if (num % i == 0) {
            return false;
        }
        i++;
    }

    return true;
}
     
}
