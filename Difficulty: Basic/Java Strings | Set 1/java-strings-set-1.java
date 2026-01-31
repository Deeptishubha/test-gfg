// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String S=S1 + S2;
        StringBuilder sb=new StringBuilder();
        for(int i=S.length()-1;i>=0;i--){
        sb.append(S.charAt(i));
        }
        return sb.toString();
    }
}