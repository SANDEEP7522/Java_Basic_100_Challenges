import java.util.Scanner;

class simpleIntrest {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("*******Welcome to my simple intrest Problem*******");
    System.out.println("Enter the nalue of P: ");
    double P = input.nextDouble();
    System.out.println("Enter the nalue of T: ");
    double T = input.nextDouble();
    System.out.println("Enter the nalue of R: ");
    double R = input.nextDouble();

    double simpleIntrest = (P*R*T)/100;

    System.out.println("Your final solution of simple Intrest= " + simpleIntrest);
}

}
