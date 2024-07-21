import java.util.Scanner;

class andOperator {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("********Showcasing bitwise nd Operator**********");  
   System.out.println("Enter your first choice number: ");
   int first = input.nextInt();
   System.out.println("Enter your second choice number: ");  
   int secont = input.nextInt();

   int result = first & secont; 
   System.out.println("your Result= " + result);
}    
}
