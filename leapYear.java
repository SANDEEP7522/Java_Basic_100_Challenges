import java.util.Scanner;

class leapYear {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    System.out.println("******** Welcome to the Finder of LeapYear ********");
    System.out.println("Enter the year if you want to check it is a leep year");
    int year = input.nextInt();

    if (year % 4 == 0 || year % 400 == 0) {
        System.out.println("Your enter year is a LeapYear " + year );
    } else if (year % 100 == 0 ) {
        System.out.println("Your enter year is not a LeapYear " + year );
    }
     else {
        System.out.println("Your enter year is not a LeapYear " + year );
    } 
}    
}
