class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder  reverse=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }
}