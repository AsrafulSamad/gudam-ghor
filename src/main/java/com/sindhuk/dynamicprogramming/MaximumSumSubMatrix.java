package main.java.com.sindhuk.dynamicprogramming;

/**
 * Created by asraful on 7/24/2017.
 */
public class MaximumSumSubMatrix {
    // Time Complexity O(n) | Modified Kadane's Algo
    public static int[] maxSubArrayTwo(int[] nums) {
        int ans[] = new int[3];  // 0 -> max, 1 -> start index(i), 2 -> end index(j);
        ans[0] = nums[0];
        ans[1] = 0;
        ans[2] = 0;

        int maxCur = nums[0];
        int temp_i = 0;
        int temp_j = 0;
        for(int i =1; i<nums.length; i++){
            if(nums[i] > (maxCur + nums[i])){
                maxCur = nums[i];
                temp_i = i;
            }else{
                maxCur = maxCur += nums[i];
            }
            temp_j = i;

            int temp = Math.max(ans[0], maxCur);
            if(ans[0] != temp){
                ans[0] = temp;
                ans[1] = temp_i;
                ans[2] = temp_j;
            }
        }
        return ans;
    }

    /**
     * To find and print maxSum, (left, top),(right, bottom)
     * Time Complexity: O(n^3)
     */
    public static void findMaxSubMatrix(int[][] a) {
        int cols = a[0].length;
        int rows = a.length;
        int[] currentResult;
        int maxSum = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int ii = 0;
        int jj = 0;

        for (int leftCol = 0; leftCol < cols; leftCol++) {
            int[] tmp = new int[rows];

            for (int rightCol = leftCol; rightCol < cols; rightCol++) {

                for (int l = 0; l < rows; l++) {
                    tmp[l] += a[l][rightCol];
                }

                currentResult = maxSubArrayTwo(tmp);
                if (currentResult[0] > maxSum ) {
                    maxSum = currentResult[0];
                    j = leftCol;
                    i = currentResult[1];
                    jj = rightCol;
                    ii = currentResult[2];
                }
            }
        }

        System.out.println("MaxSum: " + maxSum +
                ", range: [(" + i + ", " + j +
                ")(" + ii + ", " + jj + ")]");
    }

    public static void main(String []arg){
        int matrix[][] = {
                {5,-4,-3,4},
                {-3,-4,4,5},
                {5,1,5,-4}
        };

        findMaxSubMatrix(matrix);

    }

}
