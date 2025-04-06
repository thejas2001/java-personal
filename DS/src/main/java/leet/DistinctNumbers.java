package leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DistinctNumbers {
    public static void main(String[] args) {
        System.out.println(distinctAverages1(new int[]{9,5,7,8,7,9,8,2,0,7}));
        System.out.println(distinctAverages2(new int[]{9,5,7,8,7,9,8,2,0,7}));

    }

    public static int distinctAverages1(int[] nums) {
        Double[] num = new Double[nums.length/2];
        Arrays.sort(nums);
        for(int i=0;i<(nums.length/2);i++){
            num[i]=new Double((nums[i]+nums[nums.length-1-i])/2.0);
        }
        Set<Double> hash=new HashSet<>();
        Stream.of(num).forEach(x->hash.add(x));
        return hash.size();


    }
    public static int distinctAverages2(int[] nums) {
        if(nums.length <= 1) return 0;
        Arrays.sort(nums);
        Set<Double> uniqueAvg = new HashSet<>();

        int left = 0, right = nums.length-1;

        while(left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            uniqueAvg.add(avg);
            left++;
            right--;
        }
        return uniqueAvg.size();
    }
}
