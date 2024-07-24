import java.util.Scanner;

/**
 * 32 lcmOfTwoNumber
 */
 class lcmOfTwoNumber {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("****Welcome to the my Program to find the LCM of two number*****");
    System.out.println("Enter your First choice number: ");
    int first = input.nextInt();
    System.out.println("Enter your Second choice number: ");
    int second = input.nextInt();
    
    int factor = lCMOfTwoNumber(first, second);
    System.out.println("LCM is " + factor );

   }

   public static int lCMOfTwoNumber(int first, int second) {
    int i = 1;
    while (true) {
        int factor = first * i;
        if (factor % second == 0) {
            return factor;
        }
        i++;
    }
    
   }
    
}
