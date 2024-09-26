package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class rotateArraybyKplaces {
//      public void rotate(int[] arr, int k) {
//         int n = arr.length;
//         k = k % n; // Handle cases where k > n
//         int[] temp = new int[n];

//         // Copy rotated elements into the temp array
//         for (int i = 0; i < n; i++) {
//             temp[(i + k) % n] = arr[i];
//         }

//         // Copy the temp array back to the original array
//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i];
//         }
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = {1, 2, 3, 4, 5, 6, 7};
//         int k = 3;
//         sol.rotate(arr, k);
//         System.out.println(Arrays.toString(arr)); // Output: [5, 6, 7, 1, 2, 3, 4]
//     }
// }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[(i + k) % n] + " ");
        }

    }
}
