public class cielingofanumber {
    public static void main(String[] args) {
        int[] arr = {2,4,8,10,14,18};
        int target = 15;
        int cieling  = ceilingofaNo(arr,target);
        System.out.println(cieling);
    }
    static int ceilingofaNo(int[] arr,int target){
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
    //  return arr[start]; returns the value
        return start; // returns the index number;
    }
}
