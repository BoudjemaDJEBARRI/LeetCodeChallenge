import java.util.HashMap;
import java.util.Map;

public class TwoSumMeth2 {
    public static void main(String[] args) {
        int[] arrNum = {2, 4, 5, 8, 3};
        int target = 7;

        System.out.println(twoSum1(arrNum, 7));
        System.out.println(twoSum2(arrNum, 7));
    }

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
      public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map2.put(nums[i], i);
        }
          for (int i = 0; i < nums.length; i++) {
              int diff2 = target - nums[i];
              if (map2.containsKey(diff2) && map2.get(diff2) != i);
              return new int[] {map2.get(diff2)};
          }

          return nums;
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
