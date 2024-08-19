public class MinSubarraySum
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int n=nums.length,left=0,right=0,sum=0,minLen=Integer.MAX_VALUE;

        while(right<n)
        {
            sum = sum + nums[right];

            while(sum>=target)
            {
                minLen = Math.min(minLen,right-left+1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}
