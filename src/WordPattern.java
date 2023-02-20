import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String s = "Cat, Bat, Bat, Cat";
        String pattern = "avre";

        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern (String pattern, String s){
        String[] arr1 = s.split(" ");
        if (pattern.length() != arr1.length) {
            return false;
        }
        HashMap<Character,String> hm1 = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containsKey = hm1.containsKey(ch);
            if (hm1.containsValue(arr1[i]) && !containsKey) {
                return false;
            }
            if (containsKey && !hm1.get(ch).equals(arr1[i])){
                return false;
            } else {
                hm1.put(ch,arr1[i]);
            }
        }
        return true;
    }

}
