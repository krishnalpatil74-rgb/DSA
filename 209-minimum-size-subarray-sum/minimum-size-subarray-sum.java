class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int low = 0;
        int high=0;
        int minLenwindow = Integer.MAX_VALUE;

        for( high = 0; high < nums.length; high++) {
            currentSum += nums[high];

            while(currentSum >= target) {
                int currentWindow = high - low + 1;
                minLenwindow = Math.min(minLenwindow, currentWindow);
                currentSum -= nums[low];
                low++;
            }
        }

        return minLenwindow == Integer.MAX_VALUE ? 0 : minLenwindow;
    }
}