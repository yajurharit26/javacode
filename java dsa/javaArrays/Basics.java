import java.io.*;
import java.util.*;
import java.lang.Math;

public class Basics {
    
    public static void main(String[] args) 
    // throws IOException 
    {
        //  int x = 5 ; 
        // System.out.println(x);
        // x = 10;
        // System.out.println(x);
        // String FirstName = "John";
        // String LastName = "Doe";
        // System.out.println(FirstName + LastName);
        // int x = 5;
        // x |= 3;
        // System.out.println(x);
        //     int[] a = {1,2,3};
        //     int[] b = {1,2,3};
        //     System.out.println(Arrays.toString(a));
        //     System.out.println(Arrays.toString(b));
        //     b[1] = 5;
        //     System.out.println(Arrays.toString(a));
        //     System.out.println(Arrays.toString(b));
        // int[] a;
        // System.out.println(Arrays.toString(a));
        // int a = 10;
        // System.out.println(a++);
        // System.out.println(++a);
        // BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        // String str = bfn.readLine();
        // int it = Integer.parseInt(bfn.readLine());
        // System.out.println("entered string: "+ str);
        // System.out.println("entered integer : " + it); 
    Scanner sc = new Scanner(System.in);
    // int a  = sc.nextInt();
    // System.out.println(a);
    // int count = 0;
    // int a = sc.nextInt();
    // int b = (int)Math.pow(a,0.5);
    // for (int i = 2; i <= a; i++) {
        //         if (i % b != 0) {
            //             System.out.println(i);
            //         }
            
            //     }
            // if (count== 0) {
                //     System.out.println(a + "is a prime number");
                // }
                // else{
                    //     System.out.println(a+" is not a prime number" );
                    // }
                    // int low = sc.nextInt();
                    // int high  = sc.nextInt();
                    // for (int i = low; i <= high ; i++) {
                        //     int count = 0;
                        //     for (int j = 2; j*j <=i; j++) {
                            //         if (i%j == 0) {
                                //             count++;
                                //             break;
                                //         }
                                //     }
                                //    if (count == 0) {
                                    //        System.out.println(i);
                                    //    }
                                    // }
                                    // int n=sc.nextInt();
                                    // int a = 0;
                                    // int b = 1;
                                    // for (int i = 0; i <n;i++ ) {
                                        //     System.out.println(a);
                                        //     int c = a+b;
//     a = b;
//     b = c; 

// }
// int n = sc.nextInt();
// int temp  = n;
// int count = 0;
// // int rem = 0;
// while (temp!= 0) {
    //     temp /= 10;
    //     count++;
    // }
    // int rem = (int)Math.pow(10, count-1);
    // while(rem!= 0){
        //     int q = n/rem;
        //     System.out.println(q);
        //     n = n%rem;
        //     rem = rem/10;
        // }
        // int n = sc.nextInt();
        // int rem = 0;
        // while (n!=0) {
            //     rem = n%10;
//     System.out.print(rem);
//     n=n/10;
// }

// ROTATE THE NUMBER
// int n = sc.nextInt();
// int a = sc.nextInt();

// int rem = 0;
// int temp = n;
// while (temp> 0) {
    //     temp = temp/ 10;
    //     rem++;
    // }
    
    // a = a% rem;
    // if (a<0) {
        //     a = a + rem;
        // }
        // int div = 1;
        // int mult = 1;
        // for (int i = 1; i <= rem; i++) {
            //     if (i<=a) {
                //         div = div *10;
                //     }else{
                    //         mult = mult * 10;
                    //         }
                    //     }
                    //     int q = n/div;
                    //     int r = n%div;
                    //     int rot  = r * mult + q;
                    //     System.out.println(rot);
                    // END OF CODE
                    // // GCD AND LCM
                    // int a = sc.nextInt();
                    // int b = sc.nextInt();
                    // int oa = a;
                    // int ob = b;
                    // // for (int i = 0; i <= ; i++) {
                        //     while (a%b!=0) {
                            //         int rem = a%b;
                            //         a=b;
                            //         b=rem;
                            //     }
                            //   int gcd = b;
                            //   int lcm = (oa*ob)/gcd;
                            //   System.out.println("gcd is of 2 number is "+gcd);
                            //   System.out.println("LCM of two numbers is"+lcm);
                            // END OF CODE
                            // PRIME FACTORIZATION
                            // int n = sc.nextInt();
                            // for (int i = 2; i*i < n; i++) {
    //     while (n%i==0) {
        //         n = n/i;
        //         System.out.print(i);
        //         }
        //     }
        //     if(n!=1){
            //         System.out.print(n);
            //     }
            // END OF CODE
            // PYTHAGORAS THEORAM
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int c = sc.nextInt();
            // int max = a;
            // if(max<=b ){
                //     max = b;}
                // if (max<=c) {
                    //     max = c;
                    // }
                    // if(max==a){
                        //     boolean flag = ((b*b + c*c)==(a*a));
                        //     System.out.println(flag);
                        // }else if(max == b){
                            //     boolean flag = ((a*a + c*c)==(b*b));
                            
                            // } else{
                                //     boolean flag = ((a*a + b*b)==(c*c));
                                // }
                                // END OF CODE
                                // BENJAMIN BULBS
                                // int n = sc.nextInt();
                                // for (int i = 1; i <= n; i++) {
                                    //     System.out.println(i*i);
                                    // }
                                    // ENDOFCODE    
                                    // PATTERN OF W
                                    // int n = sc.nextInt();
                                    // for (int i = 1; i <=n ; i++) {
                                        //     for (int j = 1; j <=n; j++) {
//         if (j==1||j==n) {
    //             System.out.print("*\t");
    //         }
    //         else if (i>n/2 && (i==j||i+j==n+1)){
        //             System.out.print("*\t");
        //         }
        //         else{
            //             System.out.print("\t");
            //         }
            //     }
            //     System.out.println();}
            // END OF CODE
            // DIGITS FREQUENCY
            // int n = sc.nextInt();
            // int d = sc.nextInt();
            // int f = frequency(n, d);
            // System.out.println(f);
            // END OF CODE
            // DECIMAL TO ANY BASE 
            // int n = sc.nextInt();
            // int b = sc.nextInt();
            // int dn = decimaltoocta(n,b);
            // System.out.println(dn);
            // END OF CODE
            // BINARY TO OCTAL CONVERSION
            System.out.println("abc");
        }
        public static int decimaltoocta(int n,int b){
            int rv = 0;
            int p = 1;
            while (n>0){
                int dig = n%b;
                n= n/b;
                rv += dig*p;
                p= p*10;
            }
            return rv;
        }
        
        public static int frequency(int n,int d){
            int rv = 0;
            while (n>0) {
                int dig = n%10;
                n = n/10; 
            
            if (dig==d){
                rv++;
            }}
            return rv;
    }
        
        
        
    }
