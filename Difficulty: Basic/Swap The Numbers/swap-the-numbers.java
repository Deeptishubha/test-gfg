// User function Template for Java
import java.util.*;
class Solution {
    public void swap(int a, int b) {
        // code here
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a + " " + b);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution o=new Solution();
        o.swap(a,b);
}}
