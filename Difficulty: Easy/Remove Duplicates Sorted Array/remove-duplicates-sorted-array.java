class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> remove=new ArrayList<>();
        remove.add(arr[0]);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                remove.add(arr[i+1]);
            }
        }
        return remove;
    }
}
