import java.util.*;
import java.lang.Math.*;
public class maxsubarraysum {
    static void subArraySumBruteForce(int arr[],int curSum,int maxSum){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                curSum = 0;
                for(int k = i;k<=j;k++){
                    curSum += arr[k];
                }
                System.out.println(curSum);
                if(maxSum<curSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max sub array sum is "+maxSum);
    }
    static void subArraySumPrefixSum(int arr[]){
        // TIME COMPLEXITY IS O(N^2)
        int prefixSum[] = new int[arr.length];
        int curSum = 0;
        int maxSum = 0;
        prefixSum[0]  = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                curSum = i == 0 ?prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(maxSum<curSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max sub array sum is "+maxSum);
    }
    static void SubArraySumKadaneAlgo(int arr[]){
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            cursum = cursum + arr[i];
            if(cursum<0){
                cursum = 0;
            }
            maxsum = Math.max(cursum,maxsum);
        }
        System.out.println("Max sub array sum is "+maxsum);

    }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // int curSum = 0;
        // int maxSum = Integer.MIN_VALUE;
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        // subArraySumBruteForce(arr, curSum, maxSum);
        // subArraySumPrefixSum(arr);
        SubArraySumKadaneAlgo(arr);
        
    }
}
