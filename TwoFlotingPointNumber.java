
import java.util.Scanner;

/**
 * 09 TwoFlotingPointNumber
 */
 class TwoFlotingPointNumber {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("      To calculate two floting numbers");
    System.out.println("Enter your floying number: ");
    double firstNumber = input.nextDouble();
    System.out.println("Enter your secound number: ");
    double seconsNumber = input.nextDouble();
    
    double add = firstNumber + seconsNumber;
    double sub = firstNumber - seconsNumber;
    double multiply = firstNumber * seconsNumber;
    double divide = firstNumber / seconsNumber;
    double modules = firstNumber % seconsNumber;
     
    System.out.println("Addition of two number: " + add);
    System.out.println("sub of two number: " + sub);
    System.out.println("multiply of two number: " + multiply);
    System.out.println("divide of two number: " + divide);
    System.out.println("Modules of two number: " + modules);

    
 }    
}
