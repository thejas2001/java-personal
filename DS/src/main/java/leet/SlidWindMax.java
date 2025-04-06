package leet;

import java.util.stream.Stream;

public class SlidWindMax {
    //239
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};
        for(Integer x:maxSlidingWindow(arr,3)){
            System.out.println(x);
        }
//Stream.of(maxSlidingWindow(arr,3)).toList().forEach(System.out::println);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        int resSize = (size - k + 1)<0?1: size - k + 1;
        int res[] = new int[resSize];
        if(k>size){
            res[0] = maxRes(nums,0,k);
            return res;
        }

        for(int i=0;i<resSize;i++){
            res[i]=maxRes(nums,i,k);
        }
        return res;
    }
    public static int maxRes(int[] arr, int left, int right){
        int maxElement = Integer.MIN_VALUE;
        for(int i=left;i<left+right;i++){
            maxElement=Math.max(maxElement,arr[i]);
        }
        return maxElement;
    }
}
