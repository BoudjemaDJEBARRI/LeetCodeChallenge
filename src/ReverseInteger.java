public class ReverseInteger {
    public static void main(String[] args) {

        int y = 234455467;

        System.out.println(reverseInteger(y));
    }

    public static int reverseInteger(int y) {
        int num = y;
        long rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = 10 * rev + digit;
            if (rev > Integer.MAX_VALUE) return 0;
            if (rev < Integer.MIN_VALUE) return 0;
            num /= 10;
        }
        return (int) rev;
    }
}

