import java.util.Scanner;

class sumOfTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******Welcome to my Program that compute the Sum Of all Digits*******");
        System.out.println(" Enter Your choice number: ");
        int num = input.nextInt();

        int sum = sumOfDigits(num);
        System.out.println("The Sum Of all Digits " + sum);
    }

 public static int sumOfDigits(int num) {
      int sum = 0;
      while (num > 0) {
        sum = sum + num % 10; //Or sum+=num%10;
        num = num/10; //Or num/=10;
      }  
        return sum;
    }
    
}
