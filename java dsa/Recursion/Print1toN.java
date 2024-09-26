package Recursion;

public class Print1toN {
    public static void increase(int n) {
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        increase(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Print numbers from 1 to "+ n+" are: ");
        increase(n);    
    }
    
}
