class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {
        // code here
        if(Q==1){
            A.add(Query.get(0),Query.get(1));
            return A;
        }
        if(Q==2){
            int p = Query.get(0);
            ArrayList<Integer> result=new ArrayList<Integer>();
           result.add(A.lastIndexOf(p));
           return result;
        }
        return A;
    }
}