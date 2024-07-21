import java.util.Scanner;

class greatstOfThreeNumber {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("+++++++++++Welcomre to my finder the Freatest of three number++++++++++");
      System.out.println("Enter your first choice number: ");
      int first = input.nextInt();
      System.out.println("Enter your second choice number: ");
      int second = input.nextInt();
      System.out.println("Enter your thired choice number: ");
      int thired = input.nextInt();

      if (first >= second && first >= thired) {
        System.out.println("Your number is Greater then other number: " + first);
      } else if( second >= thired){
        System.out.println("Your number is Greater then other number: " + second); 
      }
      else {
        System.out.println("Your number is Greater then other number: " + thired); 
      }
   }    
}
