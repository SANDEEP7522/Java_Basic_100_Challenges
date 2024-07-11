import java.util.Scanner;

public class InputeName {
    public static void main(String[] args) {
        System.out.println("Please Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " my home Town");
    }
}
