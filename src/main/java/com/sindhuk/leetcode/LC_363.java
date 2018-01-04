package main.java.com.sindhuk.leetcode;

/**
 * Created by asraful on 7/24/2017.
 */
public class LC_363 {

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


    public static int maxSumSubmatrix(int[][] matrix, int k) {
        int cols    = matrix[0].length;
        int rows    = matrix.length;
        int maxSum  = Integer.MIN_VALUE;

        for (int leftCol = 0; leftCol < cols; leftCol++) {
            int[] tmp = new int[rows];
            for (int rightCol = leftCol; rightCol < cols; rightCol++) {
                for (int l = 0; l < rows; l++) {
                    tmp[l] += matrix[l][rightCol];
                }
                int currentResult = maxSumSubArrayNoGreaterThanK(tmp,k);
                if (currentResult > maxSum) {
                    maxSum = currentResult;
                }
            }
        }
        return maxSum;
    }

    public static void main(String []arg){
        int matrix[][] = {
                            {5,-4,-3,4},
                            {-3,-4,4,5},
                            {5,1,5,-4}
                         };

        int temp[]= {1,9,1};

        //System.out.println(MaxSumSubArrayNoGreaterThanK(temp,10));
        System.out.println(maxSumSubmatrix(matrix,10));

    }

}
