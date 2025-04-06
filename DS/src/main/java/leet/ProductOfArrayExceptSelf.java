package leet;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        for(Integer i:productExceptSelf(new int[]{1,2,3,4})){
            System.out.println(i);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = mult(nums,0,i)*mult(nums,i+1,nums.length);
        }
        return res;
    }
    public static int mult(int[] nums,int left,int right){
        int res = 1;
        for(int i=left;i<right;i++){
            res*=nums[i];
        }
        return res;
    }
}
