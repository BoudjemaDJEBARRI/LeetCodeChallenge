public class ReverseString {
    public static void main(String[] args) {

        String str = "1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1";
        System.out.println(reverseWithStringBuilder(str));

        System.out.println(reverseManually(str));
    }

    //Meth 1 : Use Spring method
    public static String reverseWithStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();
    }

    //Meth 2 : Reverse Manually
    public static String reverseManually(String str){
        //?????
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            //????
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
