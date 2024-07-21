
import java.util.Scanner;

/**
 * 10 PerimeterRectangle
 */
public class PerimeterRectangle {
           public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("*****Calculate Here Perimete of a rectangle*****");
           System.out.println("Enter the value A: ");
           double a = input.nextDouble();
           System.out.println("Enter the value B: ");
           double b = input.nextDouble();
           System.out.println("Enter the value C: ");
           double c = input.nextDouble();
           System.out.println("Enter the value D: ");
           double d = input.nextDouble();

           double perimeterOfAReactangle = a + b + c + d;
            System.out.println(" perimeter Of A Reactangle=" + perimeterOfAReactangle);

            }
    
}