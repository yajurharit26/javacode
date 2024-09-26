public class selectionSort {
    public static void selectionsort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos] >arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2};
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
            }
        System.out.println();
        selectionsort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
            }
    }
    
    }

