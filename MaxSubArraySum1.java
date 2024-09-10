//Brute Force

public class MaxSubArraySum1 {
    public static void maxSumSubarray(int[] nums) {
        int currSum;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            int start=i;
            for(int j=i;j<nums.length;j++) {
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++) {
                    currSum=currSum+nums[k];
                }
                //System.out.println(currSum);
                if(maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum subarray sum: "+maxSum);
    }
    public static void main(String[] args) {
        int nums[]={1, -2, 6, -1, 3};
        maxSumSubarray(nums);
    }
}
