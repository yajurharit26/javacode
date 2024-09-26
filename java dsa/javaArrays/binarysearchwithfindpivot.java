import java.util.*;

public class binarysearchwithfindpivot {
    public static int findtarget(int arr[], int target){
        int index = 0;
        int pivot = findpivot(arr);
        int firstTry = BS(arr,index,pivot,target);
        if (firstTry != - 1) {
            return firstTry;
        }
        else{
            return BS(arr,pivot+1,arr.length-1,target);
        }
    }
    public static int BS(int arr[], int start,int end,int target){
        while (start<end) {
            int mid = start+ (end-start)/2;
            if (arr[mid]== target) {
                return mid;
            }
            if (arr[mid]<target) {
                start =  mid+1;
            }else{
                end = mid-1;   
            }
        }
        return -1;
    }
    public static int findpivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            int mid = start + (end - start)/2;
            if (arr[mid]>arr[mid+1]) {
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = findtarget(arr,target);
        System.out.println("found at : " + result); 
    }

}
