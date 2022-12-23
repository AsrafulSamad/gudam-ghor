package main.java.com.sindhuk.leetcode.ds1.string;

public class LC_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count[] = new int[26];
        for(char ch: ransomNote.toCharArray()){
            count[Integer.valueOf(ch) - 97] += 1;
        }

        for(char ch: magazine.toCharArray()){
            if(ransomNote.indexOf(ch) != -1) {
                count[Integer.valueOf(ch) - 97] -= 1;
            }
        }

        for(int i=0;i<26; i++){
            if(count[i] > 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] arg){
        LC_383 lc_383 = new LC_383();
        System.out.println(lc_383.canConstruct("az","ab"));
    }
}
