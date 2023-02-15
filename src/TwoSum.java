import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 4, 5, 8, 3};
        int target = 7;
        // 2+5=7

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " index: " + i + " & " + nums[j]+ " index: " + j);
                }
            }
        }
    }
}
