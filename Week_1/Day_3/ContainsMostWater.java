public class ContainsMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right)
        {
            int wid = right - left;
            int hei = Math.min(height[left],height[right]);
            int currWater = wid * hei;

            if(currWater > maxWater)
            {
                maxWater = currWater;
            }

            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxWater;
    }
    public static void main(String[]args)
    {
        int [] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}