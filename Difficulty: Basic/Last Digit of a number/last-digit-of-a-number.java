import java.util.*;
class Solution {
    public static void utility(int n) {

        // just complete below statement
        int ans =n%10;
             
            // below statement print the result
            System.out.println(Math.abs(ans));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        utility(n);
    }
}