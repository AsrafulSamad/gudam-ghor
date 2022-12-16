package main.java.com.sindhuk.leetcode.ds1;

public class LC_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

       int i=m-1, j=n-1;
       for(int k = m + n-1; k >= 0; k--){

           if(i<0){
               nums1[k] = nums2[j];
               j--;
               continue;
           }

           if(j<0){
               nums1[k] = nums1[i];
               i--;
               continue;
           }

           if(nums1[i] > nums2[j]){
               nums1[k] = nums1[i];
               i--;
           } else {
               nums1[k] = nums2[j];
               j--;
           }
       }

        for (int k: nums1) {
            System.out.print(k + " ");
        }
    }


    public static void main(String arg[]) {
        int nums1[] = {0}, m = 0, nums2[] = {1}, n = 1;
        LC_88 lc_88 = new LC_88();
        lc_88.merge(nums1, m, nums2, n);
    }
}
