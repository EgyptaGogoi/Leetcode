class Solution {
    public boolean BS (int [] a, int t){
        int l = 0, r = a.length;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] == t) return true;
            if(a[mid] > t) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] m, int t) {
        for (int i = 0; i < m.length; i++){
            if(m[i][0] <= t && t <= m[i][m[0].length-1]){
                if (BS(m[i], t))
                    return true;
            }
        }
        return false;
    }
}