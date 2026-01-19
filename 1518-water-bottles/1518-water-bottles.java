class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int val=numBottles;
        int count=0;
        while(val/numExchange >0)
        {
            int q=val/numExchange;
            int rem=val%numExchange;
            count+=q*numExchange;
            val=q+rem;
        }
        return count+val;
    }
}