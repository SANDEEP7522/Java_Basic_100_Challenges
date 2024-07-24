import java.util.Scanner;

/**
 * with Function
 * 28 multiplicationTable
 */
 class multiplicationTable {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("**** Welcome to the my Multiplication Table****");
    System.out.println("Enter your choice table number: ");
    int num = input.nextInt();
     printMultiplicationTable(num);
 
}   
public static void printMultiplicationTable(int num) {
    int i = 1;
    while (i <= 10) {
        System.out.println(num + " X " + i + " = " + (num * i));
        i++;
    }
} 
}