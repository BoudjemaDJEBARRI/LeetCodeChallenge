import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        String romanChar = "XC";
        System.out.println(romanToInt(romanChar));
    }

    public static int romanToInt(String romanChar) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if (romanChar == null || romanChar.length() == 0)
            return -1;

        int len = romanChar.length(),
                result = map.get(romanChar.charAt(len - 1));

        for (int i = len - 2; i >= 0; i--) {
            if (map.get(romanChar.charAt(i)) >= map.get(romanChar.charAt(i + 1)))
                result += map.get(romanChar.charAt(i));
            else
                result -= map.get(romanChar.charAt(i));
        }
        return result;
    }
}
