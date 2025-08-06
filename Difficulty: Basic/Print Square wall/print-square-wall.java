import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}