import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        // Time complexity = O(n)
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int partner = target - nums[i];

            if (m.containsKey(partner)) {
                return new int[]{m.get(partner), i};
            }
            m.put(nums[i], i);
        }
        return new int[]{};


        // Time Complexity = O(n^2)
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};
    }
        public static void main(String [] args){
            int [] nums ={2,7,11,15};
            int target = 9;

            System.out.println(Arrays.toString(twoSum(nums, target)));
        }
}


//  here while using the brute force method we have to traverse the array twice and the Time complexity goes O(n^2)

//  by using HashMap we map the array element with its index in the map and later we calculate the partner(by adding i t to the current index we will be abke to get to the target),
//  further we check the partner is available in the map or not

//         > if it is available then return the partner index and the current index we are at
//         > if not available then put the index(value) in the current array element (key) 