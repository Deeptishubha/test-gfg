class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int rem,reverse=0;
        while(a>0){
            rem=a%10;
            reverse=reverse*10 +rem;
            a=a/10;
        }
        if(reverse==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.isPalindrome(n));
}}