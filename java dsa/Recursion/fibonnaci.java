package Recursion;
public class fibonnaci {
    public  static int fib(int n) {
        if(n == 1|| n== 0){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    // class Solution {
    //     public int fib(int n) {
    //         int a = 1;
    //         int b = 1;
    //         int c = 0;
    //         // Scanner sc = new Scanner(System.in);
    //         for(int i = 3;i<= n;i++){
    //             c = a+b;
    //             a = b;
    //             b = c; 
    //         }
    //         if(n == 1){
    //             return 1;
    //         }
    //         if (n==2){
    //             return 1;
    //         }else{
    //         return c;}
    //     }
    // }
}
