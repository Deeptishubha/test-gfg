class Solution {
    public static int nSum(int n) {
        // code here
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans=ans+i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        int r=s.nSum(n);
        System.out.println(r);
    }
}
