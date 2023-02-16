import java.util.HashMap;
import java.util.Map;

public class TwoSumMeth2 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 5, 8, 3, 5};
        int target = 10;

        int[] result2 = twoSum2(nums, target);
        System.out.println(result2[0] + " " + result2[1]);

        int[] result1 = twoSum1(nums, target);
        System.out.println(result1[0] + " " + result1[1]);
    }

    //Meth 2
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff2 = target - nums[i];
            if (map2.containsKey(diff2)) {
                return new int[]{i, map2.get(diff2)};
            }
            map2.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }


    //Meth 3
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index1 = map1.get(nums[i]);
            if (index1 != null) {
                return new int[]{i, index1};
            }
            map1.put(target - nums[i], i);
        }
        throw new IllegalArgumentException("No Num");
    }
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
