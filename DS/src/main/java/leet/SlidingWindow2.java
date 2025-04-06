package leet;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow2 {
    public static void main(String[] args) {
        //longestSubString
        System.out.println(longestSubstring("pwwkew"));
        int[] arr=new int[128];
        System.out.println(arr['t']);
    }
    public static int longestSubstring(String s){
        Set<Character> characterSet = new HashSet<>();
        int left=0;
        int maxLength = 0;
        for(int right=0;right<s.length();right++){
            if(characterSet.contains(s.charAt(right))){
                left++;
                characterSet.remove(s.charAt(right));
            }
            characterSet.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
