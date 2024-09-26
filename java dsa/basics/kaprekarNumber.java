package basics;
import java.util.*;
public class kaprekarNumber {
    public  static int Kaprekar(int num){
        if (num == 1)
        {
            return 1;
        }
        int square = num * num;
        int numdDigits = 0;
        int temp = num;
        while(temp != 0)
        {
            numdDigits++;
            temp /= 10;
        }
        int divisor = (int)Math.pow(10,numdDigits);
        int left= square/divisor;
        int right = square%divisor;
        return (left + right==num)?1:0;
    }

    
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            System.out.println(Kaprekar(a));
        }
    }
}
