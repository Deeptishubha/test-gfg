// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        long totalfine=0L;
        if(date%2==0){
            for(int i=0;i<car.length;i++){
                if(car[i]%2!=0){
                   totalfine=totalfine+fine[i]; 
                }
            }
            return totalfine;
        }
        else{
            for(int i=0;i<car.length;i++){
                if(car[i]%2==0){
                   totalfine=totalfine+fine[i]; 
                }
            }
            return totalfine;
        }
    }
}