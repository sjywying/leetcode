package com.pangdun.leetcode;

import java.util.HashMap;

/**
 * Created by crazyy on 17/1/12.
 */
public class _3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String t1 = "abcabcbb";
        String t2 = "bbbbb";
        String t3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(t1));
        System.out.println(lengthOfLongestSubstring(t2));
        System.out.println(lengthOfLongestSubstring(t3));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
