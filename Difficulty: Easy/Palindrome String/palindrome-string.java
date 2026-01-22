class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder reverse=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            reverse.append(s.charAt(i));
        }
        String result=reverse.toString();
        if(s.equals(result)){
            return true;
        }
        else{
            return false;
        }
    }
}