package main.java.com.sindhuk.leetcode;

/**
 * Created by asraful on 10/2/2017.
 */
public class LC_278 {

    int a[] = {0,0,0,0,0,0,0,0};

    boolean isBadVersion(int version){
        if(a[version] == 1)
            return true;
        else
            return false;
    }


    public int firstBadVersion(int n) {
        int ans = binarySearch(1,n);

        if(ans > 0 && !isBadVersion(ans)){
            ans = 0;
        }

        return ans;
    }

    public int binarySearch(int l, int r) {
        //int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = l + (r-l)/2;

            // Check if x is present at mid
            if (isBadVersion(m)) {
                r = m;
            }else{
                l = m + 1;
            }
        }
        return r;
    }


    public static void main(String arg[]){
        LC_278 lc_278 = new LC_278();

        System.out.println(lc_278.firstBadVersion(7));

    }
}
