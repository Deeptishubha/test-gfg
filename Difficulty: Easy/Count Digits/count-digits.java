//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while(n>0){
            count ++;
            n=n/10;
        }
        System.out.println(count);
    }
}