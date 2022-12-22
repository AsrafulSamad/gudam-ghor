package main.java.com.sindhuk.leetcode.ds1;

import java.util.HashMap;

public class LC_387 {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch: s.toCharArray()) {
            if(hashMap.containsKey(ch)) {
                int count = hashMap.get(ch);
                hashMap.remove(ch);
                hashMap.put(ch, count + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }

        for(int i =0; i< s.length(); i++) {
            if(hashMap.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] arg){
        LC_387 lc_387 = new LC_387();
        System.out.println(lc_387.firstUniqChar("aabb"));
    }

}
