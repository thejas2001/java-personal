package leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        Map <Integer,List<Character>> map=Map.of(2,List.of('a','b','c'),3,List.of('d','e','f'),4,List.of('g','h','i'),5,List.of('j','k','l'),6,List.of('m','n','o'),7,List.of('p','q','r','s'),8,List.of('t','u','v'),9,List.of('w','x','y','z'));
        Integer digit= !digits.isEmpty() ? Integer.parseInt(digits):0;
        if(digit==0) return res;
        int a = 0;
        int b = 0;
        if(digit>10){
            b=digit%10;
            a=digit/10;
        }else{
            b=digit;
        }
        if(a==0){
            for(Character c:map.get(b)){
                res.add(String.valueOf(c));
            }
        }else{
            List<String> list=letterCombinations(String.valueOf(a));
            for(String s:list){
                for(Character c:map.get(b)){
                    res.add(s+c);
                }
            }
        }
        return res;
    }
}