import java.util.Scanner;

class sumAllOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******Welcome to sum all odd number*******");
        int num = input.nextInt();
        int sum = sumAllOddNumbers(num);
        System.out.println("OddSum till " + num + " is: " + sum);
    }

    public static int sumAllOddNumbers(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
      return sum;
        }
      
    }

