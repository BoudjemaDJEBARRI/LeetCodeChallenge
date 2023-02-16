public class ReverseString {
    public static void main(String[] args) {

        String str = "Well done";
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
