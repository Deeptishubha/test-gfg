class Solution {
    int convertfive(int num) {
        // Your code here
        if(num==0)
        return 5;
        StringBuilder sb=new StringBuilder();
        int temp=num;
        while(temp>0){
            int r=temp%10;
            if(r==0)
            sb.append(5);
            else
            sb.append(r);
            
            temp=temp/10;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
}