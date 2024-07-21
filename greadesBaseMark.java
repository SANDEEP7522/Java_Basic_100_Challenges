import java.util.Scanner;

class greadesBaseMark {
    public static void main(String[] args) {                                   Scanner input = new Scanner(System.in);
        System.out.println("+++++++Welcome to my calculates grades based on mark+++++++");
        
        System.out.println("Your % is:  ");
        int gread = input.nextInt();

        if (gread >= 90) {
            System.out.println("Your gread is  A " + gread);
        } else if (gread >= 75) {
            System.out.println("Your gread is B " + gread);
        } else if (gread >= 60) {
            System.out.println("Your gread is C " + gread);
        } else if (gread >= 30) {
            System.out.println("Your gread is D " + gread);
        } else {
            System.out.println("You Fail Fail Fail " + gread);
        }
    }
}
