public class MaximumAvgSubArray
{
    public double findMaxAverage(int[] nums, int k)
    {
        double currentSum=0;

        for(int i=0;i<k;i++)
        {
            currentSum = currentSum + nums[i];
        }

        // Initialize maxSum as the sum of the first `k` elements
        double maxSum = currentSum;
        int i=0,j=k;
        while(j<nums.length)
        {
            currentSum = currentSum + nums[j] - nums[i];
            maxSum = Math.max(maxSum,currentSum);
            i++;
            j++;
        }

        // Return the maximum average by dividing maxSum by `k`
        return maxSum/k;
    }
}
