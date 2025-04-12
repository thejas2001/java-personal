package leet;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",4));
    }
    public static String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        if(s.length()==k){
            return new StringBuilder(s).reverse().toString();
        }
        for(;i<=s.length();i+=k) {
            if(i+k<=s.length()) {
                if (j % 2 == 0) {
                    sb.append(new StringBuilder(s.substring(i, i + k)).reverse());
                } else {
                    sb.append(s.substring(i, i + k));
                }
                j++;
            }
        }
        if((i-k)<s.length()){
            sb.append(new StringBuilder(s.substring(i-k,s.length())).reverse());
        }
        return sb.toString();
    }
}
