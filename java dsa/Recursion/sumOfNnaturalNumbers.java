package Recursion;

public class sumOfNnaturalNumbers {
    public static int add(int n){
        if(n == 1){
            return 1;
        }
        return n + add(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(add(n));
    }
}
