public class bubbleSort {
    public static void bubblesort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2};
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
            }
        System.out.println();
        bubblesort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
            }
    }
    
}