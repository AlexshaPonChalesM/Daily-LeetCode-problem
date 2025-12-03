class Solution {
    public int divide(int dividend, int divisor) {
        long ans=(long)dividend/(long)divisor;
        if(ans > 2147483647)
        return 2147483647;
        if( ans < -2147483647)
        return -2147483648;
        return dividend/divisor;
    }
}