import java.util.Scanner;

/**
 * 24 complimentOperator
 */
class complimentOperator {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("********Showcasing bitwise nd Operator**********");  
   System.out.println("Enter your first choice number: ");
   int a = input.nextInt();
   System.out.println("Enter your second choice number: ");  
   int b = input.nextInt();

   int result = ~a ;
   int results = ~b; 

   System.out.println("your Result= " + result);
   System.out.println("your Result= " + results);

}        
}
