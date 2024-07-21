
import java.util.Scanner;

 class areaOfATriangle {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("*********Welcome to find the area of   triangle ********");
    System.out.println("Enter the nalue of B: ");
    double b = input.nextDouble();
    System.out.println("Enter the nalue of H: ");
    double h = input.nextDouble();

    double  areaOfATriangle = (b*h)/2;

    System.out.println("Area Of Triangle= " + areaOfATriangle);
    


}    
}
