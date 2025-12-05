class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int val=0;
        for(int i=0;i<n-1;i++)
        {
            val+=nums[i];
            sum-=nums[i];
            if((val-sum)%2==0)
            {
                count++;
            }
        }
        return count;
    }
}