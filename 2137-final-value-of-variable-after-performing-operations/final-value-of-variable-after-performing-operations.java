class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i, val=0;
        for(i=0; i<operations.length; i++){
            char[] arr = operations[i].toCharArray();
            if(arr[1]=='-')
                val-=1;
            else
                val+=1;
        }
        return val;
    }
}