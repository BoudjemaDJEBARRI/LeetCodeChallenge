public class PalindromeNumberMeth1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static int isPalindrome(int y){

        int n1 = y;
        int rev = 0;

        while (y != 0){
            rev = rev*10 + y%10;
            y = y/10;
        }
        if (rev == n1){
            System.out.println(n1 + " = " + rev);
        }else {
            System.out.println(n1 + " != " + rev );
        }
        return rev;
    }

}
