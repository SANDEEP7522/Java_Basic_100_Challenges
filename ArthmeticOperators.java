
import java.util.Scanner;

/**
 * 08 ArthmeticOperators
 */
public class ArthmeticOperators {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.println("Welcome to the My Arthmetic Operators");
     System.out.println("Enter Your first choice number: ");
     int firstNumber = input.nextInt();
     System.out.println("Enter your choice Secound number: ");
     int seconsNumber = input.nextInt();
     
     int add = firstNumber + seconsNumber;
     int sub = firstNumber - seconsNumber;
     int multi = firstNumber * seconsNumber;
     int divide = firstNumber / seconsNumber;
     int modules = firstNumber % seconsNumber;


     System.out.println("Add is: " + add);
     System.out.println("Add is: " + sub);
     System.out.println("Add is: " + multi);
     System.out.println("Add is: " + divide);
     System.out.println("Add is: " + modules);

    }
}