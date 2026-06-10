class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        int count=0;
        Arrays.sort(cost);
        int n=cost.length;
        if(n==2) return cost[0]+cost[1];
        if(n==1)return cost[0];
        for(int i=n-1;i>=0;i--)
        {
            if(count!=2)
            {
                sum+=cost[i];
                count++;
            }
            else
            {
                count=0;
            }
        }
        return sum;
    }
}