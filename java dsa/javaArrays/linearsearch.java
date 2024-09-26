public class linearsearch {
public static void main(String[] args) {
    // int[] arr = {23,45,1,2,8,19,1,2,3,4,56};
    // int target = 19;
    // int ans = linearsearch(arr,target);
    // System.out.println("Element Found at index:"+ans);
    int[][] arr = {{1,2,3,4,5},{6,4,52,8,9}};
    // int min = min(arr);
    int max = max(arr);
    System.out.println("maximum element is " + max);
}
static int min(int[][] arr){
    int min = Integer.MAX_VALUE;
    for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            if(arr[i][j]< min){
                min = arr[i][j];
            }
        }
    }

    return min;
}
static int max(int[][] arr){
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            if(arr[i][j]> max){
                max = arr[i][j];
            }
        }
    }

    return max;
}
static int linearsearch(int[] arr, int target){
    if(arr.length == 0 ){
        return -1;
    }
    for(int i = 0;i<arr.length;i++){
        int element = arr[i];
        if(element == target ){
            return i;
        }
    }
    return -1;
}
    
}