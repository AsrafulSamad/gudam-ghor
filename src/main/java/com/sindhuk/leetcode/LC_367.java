package main.java.com.sindhuk.leetcode;

/**
 * Created by asraful on 10/2/2017.
 */
public class LC_367 {

    public boolean isPerfectSquare(int num) {

        long l = 1; long r = num;
        long m = l + (r-l)/2;
        r = m;


        while(l<=r){
            m = l + (r-l)/2;
            long temp = m*m;
            if(temp == num){
                return true;
            }

            if(temp > num){
                r = m - 1;
            }else{
                l = m + 1;
            }

            //System.out.println("l:" + l + " r:" + r + " m:" + m);
        }

        return false;
    }


    public static void main(String arg[]){
        LC_367 lc_367 = new LC_367();

        System.out.println(lc_367.isPerfectSquare(81));

    }


}
