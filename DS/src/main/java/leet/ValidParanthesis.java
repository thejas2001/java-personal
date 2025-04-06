package leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> sta = new Stack<>();
        Stack<Character> sta1 = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (map.keySet().contains(c)) {
                sta.push(c);
            } else if (map.values().contains(c)) {
                sta1.push(c);
                if(!sta.isEmpty() && map.get(sta.peek()).equals(c)){
                    sta1.pop();
                }
                if (!sta.isEmpty() && !map.get(sta.pop()).equals(c)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if(sta.isEmpty() && sta1.isEmpty())
            return true;
        return false;
    }
}
