
import java.util.Scanner;

class compoundIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******* My compound Intrest Calculetor *******");
        System.out.println("Enter the Value of P: ");
        double P = input.nextDouble();
        System.out.println("Enter the value of R: ");
        double R = input.nextDouble();
        System.out.println("Enter the value of T: ");
        double T = input.nextDouble();

        double compoundIntrest = P*(1+ R/100)*T;
        System.out.println("Your Compound Intrest is " + compoundIntrest);
   
    }
}
