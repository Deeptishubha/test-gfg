import java.util.*;
class Solution {
    public int lastDigit(int n) {
        // Code here
        int rem=n%10;
        return Math.abs(rem);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        int r=s.lastDigit(n);
        System.out.println(r);
    }
}