// package Week_1.Day_3;
import java.util.*;

public class SqrOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];

        int left = 0;
        int right = nums.length-1;
        int idx = nums.length-1;

        while(left <= right)
        {
            int lSquare = nums[left]*nums[left];
            int rSquare = nums[right]*nums[right];

            if(lSquare > rSquare)
            {
                ans[idx] = lSquare;
                left++;
            }
            else{
                ans[idx] = rSquare;
                right--;
            }
            idx--;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int [] nums = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
// Time Complexity -> O(n)