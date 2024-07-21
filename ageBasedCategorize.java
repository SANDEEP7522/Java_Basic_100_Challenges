import java.util.Scanner;

/**
 * 20 ageBasedCategorize
 */
 class ageBasedCategorize {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my categorize a person into different age groups");
        System.out.println("You are a: ");
        int categori = input.nextInt();
 
        if (categori <= 13) {
            System.out.println("You are child" );
        } else if (categori <= 20) {
            System.out.println("You are Teen");
         }else if (categori <= 60) {
            System.out.println("You are Adult");
         }else {
            System.out.println("You are Senior ");
         }
     }
}