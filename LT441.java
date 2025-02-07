class Solution {
    public int arrangeCoins(int n) {
        int s = 0;
        int e = n;
        while(s<=e){
            long mid = s + (e - s)/2;
            long sum = mid*(mid+1)/2;
            if(sum == n){
                return (int)mid;
            }
            else if(sum<n){
                s =(int) mid + 1;
            }
            else{
                e = (int)mid - 1;
            }
        }
        return e;
    }
}