package main.java.com.sindhuk.leetcode.ds1.array;

public class LC_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;
        int i,j;
        int l = 0, r = row*col - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;
            i = m/col;
            j = m%col;

            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }

    public static void main(String arg[]) {
        LC_74 LC_74 = new LC_74();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(LC_74.searchMatrix(matrix,60));
    }
}
