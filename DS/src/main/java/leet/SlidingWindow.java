package leet;

import java.util.Random;

public class SlidingWindow
{
    public static void main(String[] args) {
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = new Random().nextInt(10);
        }
        for(int m=0;m<arr.length;m++){
            System.out.print(arr[m]);
        }
        System.out.println(" "+ findMaxAverageO2(arr,4));
        System.out.println(" "+ findMaxAverageO1(arr,4));
    }

    private static double findMaxAverageO2(int[] array, int k){
        int maxSum = 0;
        int size = array.length;
        for(int i=0;i<size-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
              sum+=array[j];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return (double) maxSum /k;
    }

    private static double findMaxAverageO1(int[] array, int k){
        int maxSum = 0;
        int sum = 0;
        int size = array.length;
        for(int i=0;i<k;i++){
            sum+=array[i];
        }
        maxSum=sum;
        for(int i=k;i<size;i++){
            sum+=array[i];
            sum-=array[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        return (double) maxSum /k;
    }
}
