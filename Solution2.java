import java.util.HashMap;

// O(n) = O(1)
class Solution {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = new Solution().twoSum(nums, target);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int num = target - nums[j];

            if (map.containsValue(num) && map.get(num) != j) {
                System.out.println(nums[j]);
                return new int[] { j, map.get(num) };
            }

        }

        return null;
    }
}

class Solution1 {
    public int[] twoSum(int[] s, int target) {
        int[] result = new int[2];

        for (int i = 0; i < s.length; i++) {
            for (int n = 0; n < s.length; n++) {
                if (s[n] + s[i] == target && result.length != s.length) {
                    result[1] = i;
                    result[0] = n;
                }

                if (s[n] + s[i] == target && result.length == s.length) {
                    result[1] = s[0] / s[1];
                    result[0] = s[0] - s[0];
                }

            }
        }
        return result;
    }
}

// O(n)
class Solution2 {
    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        new Solution2().twoSum(nums, target);
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];

            if (map.containsKey(num) && map.get(num) != i) {
                return new int[] {i, map.get(num)};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}