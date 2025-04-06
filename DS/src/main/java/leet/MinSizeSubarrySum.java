package leet;

public class MinSizeSubarrySum {
    //Given an array of positive integers nums and a positive integer target,
    // return the minimal length of a subarray whose sum is greater than or equal to target.
    // If there is no such subarray, return 0 instead.
    /*Input: target = 7, nums = [2,3,1,2,4,3]
    Output: 2
    Explanation: The subarray [4,3] has the minimal length under the problem constraint.*/
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minArraySize=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                if((right-left+1)<minArraySize){
                    minArraySize = right-left+1;
                }
                sum-=nums[left];
                left++;
            }
        }
        return minArraySize!=Integer.MAX_VALUE?minArraySize:0;
    }
}
