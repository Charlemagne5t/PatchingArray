public class Solution {
    public int minPatches(int[] nums, int n) {
        int res = 0;
        int j = 0;
        long k = 1;

        while (k <= n) {
            if (j < nums.length) {
                if (k == nums[j]) {
                    k = k * 2;
                    j++;
                } else if (k < nums[j]) {
                    res++;
                    k = k * 2;
                } else {
                    while (j < nums.length && nums[j] < k) {
                        k = k + nums[j++];
                    }
                }
            } else {
                res++;
                k = k * 2;
            }

        }
        return res;
    }
}
