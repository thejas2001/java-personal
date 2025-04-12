package leet;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }
    public static int removeElement(int[] nums, int val) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
        }
        int nums1[] = new int[left];
        for(int i=0;i<left;i++){
            nums1[i]=nums[i];
        }
        nums=nums1;
        return left;
    }
}
