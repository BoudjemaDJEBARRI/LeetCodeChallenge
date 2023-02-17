import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        /*
        String s1 = "Radar Sagas Rêver Rotor";
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
         */

        System.out.println("Enter Number : ");
        Scanner scan1 = new Scanner(System.in);
        int n1 = scan1.nextInt();

      //  System.out.println(PalindromeNumber(n1));
    }

    public static int palindromeChecker(int n1){

        int orgN1 = n1;
        int rev1 = 0;

        while (n1 != 0) {
            rev1 = rev1*10 + n1%10;
            n1 = n1/10;
        }

        if (orgN1 == rev1) {
            System.out.println(orgN1 + " : Palindrome");
        } else {
            System.out.println(orgN1 + " : Not Palindrome");
        }

        return rev1;
    }
}
