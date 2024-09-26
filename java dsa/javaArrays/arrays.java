import java.util.*;

public class arrays {
    public static void main(String[] args) {
        // int a[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
                
        //         System.out.print(a[i][j]);
        //     }
        //     System.out.println();
        // }
        // int [] arr = new int[5];
        // Scanner sc=new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // } 
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
        // int[] arr= {1,2,3,4,5};
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+ " ");
            
        // }
        // System.out.print(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;

        }

    }
    static void swap(int[] arr,int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
