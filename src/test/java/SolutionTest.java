import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {1,3};
        int n = 6;
        int expected = 1;
        int actual = new Solution().minPatches(nums, n);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int[] nums = {1,5, 10};
        int n = 20;
        int expected = 2;
        int actual = new Solution().minPatches(nums, n);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3() {
        int[] nums = {1,2,31,33};
        int n = 2147483647;
        int expected = 2;
        int actual = new Solution().minPatches(nums, n);

        Assert.assertEquals(expected, actual);
    }
}
