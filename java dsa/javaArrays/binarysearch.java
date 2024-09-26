public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4,6,8,10,25,35,40,100};
        int target =2;
        int foundat = binarysearch(arr,target);
        System.out.println(foundat);
    }
    static int binarysearch(int[] arr,int target){
            int start = 0;
            int end = arr.length-1;
            while (start <= end) {
                int mid = (start + end)/2;
                if (target < arr[mid]) {
                    end = mid-1;
                }else if (target>arr[mid]) {
                    start = mid+1;
                }else{
                    return mid;
                }
                
            }
            return -1;
        }
}
