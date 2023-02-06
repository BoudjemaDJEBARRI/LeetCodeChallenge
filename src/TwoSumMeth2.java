import java.util.HashMap;
import java.util.Map;

public class TwoSumMeth2 {
    public static void main(String[] args) {
        int[] arrNum = {2, 4, 5, 8, 3};
        int target = 7;
        //  System.out.println(arrNum[i]);
    }
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target-nums[i], i);
        }
        throw new IllegalArgumentException("NoNum");
    }
        /*
    public int[] twoSum(int[] arrNum, int target) {
        for (int i = 0; i < arrNum.length; i++) {
            for (int j = i + 1; j < arrNum.length; j++) {
                if (arrNum[i] + arrNum[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("NoNum");
    }

         */
}
