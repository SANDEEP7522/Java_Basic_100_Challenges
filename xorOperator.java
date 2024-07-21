import java.util.Scanner;

class xorOperator {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("********Showcasing bitwise nd Operator**********");  
   System.out.println("Enter your first choice number: ");
   int first = input.nextInt();
   System.out.println("Enter your second choice number: ");  
   int second = input.nextInt();

   int result = first ^ second; 
   System.out.println("your Result= " + result);
}        
}
