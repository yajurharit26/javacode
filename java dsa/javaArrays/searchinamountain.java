public class searchinamountain {
    public static void main(String[] args) {
        
    }
    static int search(int[] arr, int target){
        int peak = findpeak(arr);
        int firsttry = orderAgnosticBS(arr,target,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    static int findpeak(int[] arr){
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
            return start; 
    }
    static int orderAgnosticBS(int[] arr,int target, int start,int end){
        boolean isASC = arr[start]<arr[end];
        while (start<= end){
            int mid  = start+ (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }if(isASC){
                if(target< arr[mid]){
                    end  = mid -1 ;
                    }else{
                        start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
            }else{
                start = mid+1;
            }
        }

    }
    return -1;
}
}
