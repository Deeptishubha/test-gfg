// User function Template for Java

class Sol {
    int[] count(String s) {
        // your code here
        int upper=0,lower=0,special=0,numeric=0;
        for(int i=0;i<s.length();i++){
            char character=s.charAt(i);
            if(Character.isUpperCase(character))
             upper++;
             else if(Character.isLowerCase(character))
             lower++;
            else if(Character.isDigit(character))
             numeric++;
            else if(!Character.isLetterOrDigit(character))
            special++;
        }
        int[] arr={upper,lower,numeric,special};
        return arr;
}}