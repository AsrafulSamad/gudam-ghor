package main.java.com.sindhuk.dynamicprogramming;

/**
 * Created by asraful on 7/23/2017.
 */
public class Fibonacci {
    public static long fibo[];

    // Recursion | complexity O(2^n)
    public static long fiboMethodOne(int n){
        if(n==0) return 0;
        if(n<3) return 1;
        return fiboMethodOne(n-1) + fiboMethodOne(n-2);
    }

    // Recursion | memo | complexity O(nlog(n))
    public static long fiboMethodTwo(int n){
        if(n==0) return 0;
        if(n<3) return fibo[n] = 1;
        if(fibo[n] != 0) return fibo[n];
        return fibo[n] = fiboMethodOne(n-1) + fiboMethodOne(n-2);
    }

    // Iterative | Dag | Topo order | Time Complexity O(n) | Space Complexity O(n)
    public static long fiboMethodThree(int n){
        if(n==0) return 0;
        if(n<3) return  1;
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;

        for(int i=3;i<=n;i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n];
    }

    // Iterative | Dag | Topo order | Time Complexity O(n) | Space Complexity O(2)
    public static long fiboMethodFour(int n){
        if(n==0) return 0;
        if(n<3) return 1;
        long a = 1;
        long b = 1;
        for(int i=3;i<=n;i++){
            b = a + b;
            a = b - a;
        }
        return b;
    }

    public static void main(String []arg) {
        int n = 20;
        System.out.println(fiboMethodOne(n));

        fibo = new long[n+1];
        System.out.println(fiboMethodTwo(n));

        fibo = new long[n+1];
        System.out.println(fiboMethodThree(n));

        fibo = new long[n+1];
        System.out.println(fiboMethodFour(n));

    }
}
