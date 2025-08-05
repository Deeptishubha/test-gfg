import java.util.*;
class Solution {
    public int subtractProductAndSum(int n) {
        int rem,product=1,sum=0;
        while(n>0){
            rem=n%10;
            product=product*rem;
            sum=sum+rem;
            n=n/10;

        }
        int result=product-sum;
        return result;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.subtractProductAndSum(n));
    }
}