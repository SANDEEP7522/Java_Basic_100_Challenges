import java.util.Scanner;

/**
 * 15 positiveNegativeZero
 */
 class positiveNegativeZero {
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        System.out.println("************Welcome to my calculator number is Positive Negative Or Zero***********");
        System.out.println("Enter your choice number: ");
         int num = input.nextInt();

         if (num > 0) {
            System.out.println("Your enter number is Positive");
         }else if (num == 0) {
                System.out.println("Your enter number is Zero");
         }
         else{
            System.out.println("your number is Negative");
         }
       }
    
}