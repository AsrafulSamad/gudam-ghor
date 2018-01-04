package main.java.com.sindhuk.dynamicprogramming;

/**
 * Created by asraful on 7/24/2017.
 */
public class MaxSumSubArrayNoGreaterThanK {
    public static int maxSumSubArrayNoGreaterThanK(int[] s, int k) {
        int len     = s.length;
        int ans     = Integer.MIN_VALUE;
        int nums[] = new int[len];
        nums[0] = s[0];
        for(int i=1;i<len;i++){
            nums[i] = nums[i-1] + s[i];
        }

        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int sum;
                if(i==0) sum = nums[j];
                else sum = nums[j] - nums[i-1];
                if(sum > ans && sum <= k)
                    ans = sum;
            }
        }
        return ans;
    }


    /*
           // Alternate Solution : O(nlog(n))
           int best_cumulative_sum(int ar[],int N,int K)
            {
                set<int> cumset;
                cumset.insert(0);
                int best=0,cum=0;
                for(int i=0;i<N;i++)
                {
                    cum+=ar[i];
                    set<int>::iterator sit=cumset.upper_bound(cum-K);
                    if(sit!=cumset.end())best=max(best,cum-*sit);
                    cumset.insert(cum);
                }
                return best;
            }
     */



    public static void main(String []arg){
        int temp[]= {1,9,1};
        System.out.println(maxSumSubArrayNoGreaterThanK(temp,10));
    }


}



