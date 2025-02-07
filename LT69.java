class Solution {
    public int mySqrt(int x) {
        
    int s = 0;
    int e = x;
    while(s<=e){
        long mid = s+(e-s)/2;
        if(mid*mid == x){
            return (int)mid;
        }
        else if(mid*mid>x){
            e = (int)mid - 1;
        }
        else{
            s = (int)mid + 1;
        }
    }
    return e;
    }
}