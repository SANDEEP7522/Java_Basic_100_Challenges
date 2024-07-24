import java.util.Scanner;

/**
 * 30 calculateTheFactorial
 */
 class calculateTheFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my Function that calculate");
        System.out.println("Enter your choice number: ");
        int num = input.nextInt();

        long fact = factorial(num);
        System.err.println("Your factorial is: " + fact);
    }
    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
         long fact = 1;
         int i = 2;
         while (i <= num) {
              fact *= i;
            i++;
         }

        return fact;
    }
    
}