import java.util.Scanner;
// in this code we give some no. in last such no.
// how many time repeate this number
class OccurrencesArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("**** Wlecome to Array Occurrencse ****");
         int[] numArr = ArrayUtility.inputArray();
         System.out.println("Now enter the number you want to find: ");
         int num = input.nextInt();
         int occurrences = noOfOccurrences(numArr, num);
         System.out.println("your element was found "
                 + occurrences + " times in the array" );
     }

    public static int noOfOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
         return occ;
    }

}
