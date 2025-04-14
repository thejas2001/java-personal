package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CheckAllCharHaveEqualOccur {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm"));
    }
    public static boolean areOccurrencesEqual(String s) {
        //map solution
//        Map<Character,Integer> map = new HashMap<>();
//        for(Character c:s.toCharArray()){
//            if(map.get(c)==null){
//                map.put(c,1);
//            }else{
//                map.put(c,map.get(c)+1);
//            }
//        }
//        Optional<Integer> i =  map.values().stream().findFirst();
//        for(Integer m:map.values()){
//            if(!i.orElse(0).equals(m)){
//                return false;
//            }
//        }
//        return true;
        int[] freq = new int[26];
        for(Character c:s.toCharArray()){
            freq[c-'a']++;
        }
        Integer k =Arrays.stream(freq).filter(x->x!=0).findFirst().orElse(0);
        for(int i:freq){
            if(i!=0 && i!=k){
                return false;
            }
        }
        return true;
    }
}
