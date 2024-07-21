import java.util.Scanner;

class rightShiftOperator {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*********Welcome to the show use of left shift operato******r ");
        System.out.println("Enter your choice number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Your result is: " + result);
     }
    

}
