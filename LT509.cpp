class Solution {
public:
    int fib(int n) {
        double val = (1 + sqrt(5)) / 2;
        return round(pow(val,n)/sqrt(5));
    }
};