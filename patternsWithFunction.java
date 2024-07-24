import java.util.Scanner;

/**
 * 39 patternsWithFunction
 */
class patternsWithFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======Welcome to my pattern with function======");
        System.out.println("Enter your choice number of Rows: ");
        int rows = input.nextInt();

        printFirstPattern(rows);
        printSecondPattern(rows);
        printThiredPattern(rows);

    }

    public static void printThiredPattern(int maxRows) {
        System.out.println(" \n printThiredPattern");
        int rows = maxRows;
        while (rows > 0) {

            int j = 0;
            while (j < rows) {
                System.out.print("   ");
                j++;
            }

            int i = 0;
            while (i <= (maxRows - rows)) {
                System.out.print(" * ");
                i++;
            }

            System.out.println();
            rows--;
        }
    }

    public static void printSecondPattern(int maxRows) {
        System.out.println(" \n printSecondPattern");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print(" + ");
                i++;
            }

            System.out.println();
            rows--;
        }
    }

    public static void printFirstPattern(int maxRows) {
        System.out.println("\n printSecondPattern ");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print(" * ");
            int i = 0;
            while (i < rows) {
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

}
