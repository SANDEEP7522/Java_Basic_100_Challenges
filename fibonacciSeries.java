import java.util.Scanner;

/**
 * 36 fibonacciSeries
 */
class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("********Welcome to the Fibonacci Series*********");
        System.out.println("Enter your choice number: ");
        int limit = input.nextInt();

        System.out.println("Your Fibonacci sequence up to " + limit + " is: ");
        fibonacci(limit);

        input.close();
    }

    public static void fibonacci(int num) {
        if (num < 0) {
            System.err.println("Number should be non-negative.");
            return;
        }

        if (num == 0) {
            System.out.println("0");
            return;
        }

        System.out.print("0 1");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
        System.out.println();
    }
}
