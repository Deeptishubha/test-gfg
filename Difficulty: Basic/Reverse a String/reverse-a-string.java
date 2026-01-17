// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        String rev="";
        int l=(s.length())-1;
        for(int i=l;i>=0;i--){
            rev=rev+(s.charAt(i));
        }
        return rev;
    }
}