// User function Template for Java
import java.util.*;
class Solution {
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
            return "lesser";
        }
        else if(n==m){
            return "equal";
        }
        else {
            return "greater";
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
         int m=in.nextInt();
         Solution obj=new Solution();
         System.out.print(obj.compareNM(n,m));
        
    }
}