import java.util.Scanner;
/**
 * 37 PalindronNumber
 */
class palindronNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******Welcome to checker Pelindron number******");
        System.out.println("Enter the number your choice: ");
        int num = input.nextInt();
        boolean ispelindrome = ispelindrome(num);
        if (ispelindrome) {
            System.out.println("Your number is a Pelindron");
        } else {
            System.out.println("Your number is not a Pelindron");
        }
    }
    public static boolean ispelindrome(int num) {
        return num == reverse(num);
    }
    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
