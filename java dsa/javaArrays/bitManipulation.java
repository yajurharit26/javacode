import java.util.*;

public class bitManipulation {
    public static int getithbit(int n, int i){
        int bitmask = 1<<i;
        if ((n&bitmask)==0) {
            return 0;
        }else{
            return 1;
        }
    }
    public static int setithbit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearithbit(int n,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int updateIthbit(int n,int i,int newBit) {
        // if(newBit==0){
        //     return clearithbit(n, i);
        // }else{
        //     return  setithbit(n,i);
        // }
        n = clearithbit(n, i);
        int bitmask = newBit<<i;
        return n|bitmask;
    }
    public static int clearIbits(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearRangebits(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static boolean checkPowerOf2(int n){
        return (n & (n-1)) == 0;
    }
    public static int countsetbits(int n){
        int count = 0;
        while (n>0) {
            if ((n&1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastexponentiation(int n, int p){
        int ans = 1;
        while (p > 0) {
            if ((p&1)!= 0) {
                ans = ans * n;
            }
            n = n*n;
            p = p>>1;
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        // 1's complement
        // System.out.println((~0));
        // binary And
        // System.out.println((5&6));
        // binary OR
        // System.out.println((5|6));
        // binary XOR
        // System.out.println((5^6));
        // binary left shift
        // System.out.println((5<<2));
        // binary right shift
        // System.out.println((6>>1));
        // check even or odd
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();    
        // int bitmask = 1;
        //     if ((n & bitmask)==0) {
        //         System.out.println("even");
        //     }else{
        //         System.out.println("odd");
        //     }
        // int result = getithbit(n, 2);
        // System.out.println(result);
        // int result = setithbit(n, 2);
        // int result = clearithbit(n, 1);
        // int result = updateIthbit(n, 2,1);
        // int result = clearIbits(n,2);
        // int result = clearRangebits(n,2,4);
        // System.out.println(checkPowerOf2(n));
        // System.out.println(countsetbits(n));
        System.out.println(fastexponentiation(3,5));
    }
}