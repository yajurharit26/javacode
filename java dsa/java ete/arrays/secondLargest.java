package arrays;
import java.util.*;

public class secondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[n - 1] == arr[n - 2]) {
            System.out.println("No second largest number");

        } else {
            System.out.println(arr[n - 2]);
        }
    }
}