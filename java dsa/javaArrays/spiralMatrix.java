    import java.util.*;
    public class spiralMatrix {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr1[][] = new int[n][m];
            
            for(int i= 0;i<n;i++){
                for(int j = 0;j< m;j++){
                    arr1[i][j] = sc.nextInt();
                }
                
            }
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr2[][] = new int[a][b];
            for(int i= 0;i<a;i++){
                for(int j = 0; j<b ; j++){
                    arr2[i][j] = sc.nextInt();
                }

            }
            if(n != b){
                System.out.println("Cannot Multiply");
            }
            int sum = 0;
            int ans[][] = new int[n][b];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<b;j++){
                    for(int k = 0;k<m;k++){
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    ans[i][j] = sum;
                    sum = 0; 
                }
            }
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    System.out.println(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
