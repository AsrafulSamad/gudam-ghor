package main.java.com.sindhuk.leetcode.ds1;


import java.util.BitSet;

public class LC_36 {
    public boolean isValidSudoku(char[][] board) {
        BitSet bitMat[] = new BitSet[27];
        for(int i=0; i<27; i++) {
            bitMat[i] = new BitSet(9);
        }

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j] == '.') {
                    continue;
                }

                int a = Integer.parseInt(String.valueOf(board[i][j])) - 1;
                int k = j/3;
                if(i/3 == 1){
                    k += 3;
                } else if (i/3 == 2) {
                    k += 6;
                }

                if(bitMat[i].get(a) || bitMat[j+9].get(a) || bitMat[k+18].get(a)){
                    return false;
                }

                bitMat[i].set(a,true);
                bitMat[j+9].set(a,true);
                bitMat[k+18].set(a,true);
            }
        }
        return true;
    }

    public static void main(String arg[]) {
        LC_36 LC_36 = new LC_36();
        char board[][] =
            {{'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(LC_36.isValidSudoku(board));
    }
}
