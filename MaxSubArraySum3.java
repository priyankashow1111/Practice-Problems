public class MaxSubArraySum3 {
    public static void kadanes(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++)  {
            currSum=currSum+nums[i];
            if(currSum<0) {
                currSum=0;
            }
            maxSum=Math.max(maxSum, currSum);
        }
        System.out.println("Maxium subarray sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int nums[]={-2, -3, -4, -1, -2, -1, -5, -3};
        kadanes(nums);
    }
}
