    public class peakElement{
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,3,2};
            System.out.println("Peak element is: " + peakIndex(arr));
        }
        static int peakIndex(int[] arr){
            int start =0;
            int end = arr.length -1;
            while(start<end){
                int mid = start+ (end-start)/2;
                if( arr[mid]> arr[mid+1]){
                    end = mid;
                }else{
                    start = mid+1;
                }
            }
            return arr[start];
        }
    }