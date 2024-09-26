package Recursion;

public class factorial {
    public static int fact(int n){
        if (n<0) {
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n = -1;
        int f =   fact(n);
        if(f>=1){
        System.out.println("Factorial of " + n + " is " + fact(n));}
        else{
            System.out.println("factorial of "+ n + " doesn't exist");
        }
    }
}
