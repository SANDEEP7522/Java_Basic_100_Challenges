
import java.util.Scanner;

 class converToFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******Welcome to my conver To Fahrenheit To Celsius calculator********");
        System.out.println("Enter the value if C: ");
        double C = input.nextDouble();
        System.out.println("Enter the value if F: ");
        double F = input.nextDouble();

        double Celsius = (F - 32)*5/9;
        System.out.println("Final tempreture is: " + Celsius);
    }
}
