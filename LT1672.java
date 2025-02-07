class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int temp = 0;
            for(int j=0;j<m;j++){
                temp += accounts[i][j];
            }
            ans = Math.max(temp,ans);
        }
        return ans;
    }
}