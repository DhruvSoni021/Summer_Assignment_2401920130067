public class MaximumSubarray{
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            // currentSum
            if(nums[i] > currentSum + nums[i])
            {
                currentSum = nums[i];
            }
            else{
                currentSum = currentSum + nums[i];
            }

            // maxSum
            if(maxSum < currentSum)
            {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}