package main.java.com.sindhuk.leetcode.ds1.array;

public class LC_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(mat.length * mat[0].length != r*c ){
            return mat;
        }

        int ans[][] = new int[r][c];
        int rc = 0;
        int cc = 0;
        for(int i= 0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                ans[rc][cc] = mat[i][j];
                if(cc + 1 == c) {
                    ++rc;
                    cc = 0;
                } else{
                    ++cc;
                }
            }
        }

//        for(int i= 0; i<r; i++){
//            for(int j=0; j<c; j++) {
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }
        return ans;
    }

    public static void main(String arg[]) {
        int nums[][] = {{1,2}, {3,4}};
        int r=2,c=2;

        LC_566 lc_566 = new LC_566();
        lc_566.matrixReshape(nums, r,c);

    }
}
