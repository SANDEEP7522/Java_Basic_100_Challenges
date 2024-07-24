import java.util.Scanner;

/**
 * 33 greatestCommonDivisor   ERROOR PROBLEM
 */
 class greatestCommonDivisor {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******Welcome to the finder of Greatest Common Divisor of two integers******");
        System.out.println("Enter your First choice nubmber: ");
        int first = input.nextInt();
        System.out.println("Enter your second choice number: ");
        int secoud = input.nextInt();
        
        int gcd = gcd(first, secoud);
        System.out.println("GCD of the number is: " + gcd);
        // int least = least(first, secoud);
        // System.out.println(" least num " + least);
    }    
   public static int gcd(int first, int second) {
    int gcd = 1;
    int i = 2; 
    int least = least(first, second);
    while (i <= least) {
        if (first % == 0 && second % i == 0) {
           gcd = i;           
        }
        i++;
    }
    return gcd;
   }
   public static int least(int first, int second) {
    if (first < second) {
        return first;
    } else {
        return second;
    }
   }
}
