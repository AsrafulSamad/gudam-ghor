package main.java.com.sindhuk.leetcode.ds1.string;

public class LC_242 {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int count[] = new int[26];
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i) - 97] += 1;
            count[t.charAt(i) - 97] -= 1;
        }

        for(int i=0; i<26; i++) {
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] arg){
        LC_242 lc_242 = new LC_242();
        System.out.println(lc_242.isAnagram("rat","car"));
    }
}
