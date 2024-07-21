import java.util.Scanner;

class evenOddBitwiseOperator {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("****Welcome to check if a given number is even or odd useing bitwise operators*****");
        System.out.println("Enter your choice number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Your Enter number is Odd ");
            
        } else {
            System.out.println("Your Enter number is even ");
            
        }
        input.close();
       }
}
