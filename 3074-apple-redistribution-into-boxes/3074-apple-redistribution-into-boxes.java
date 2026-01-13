class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length;
        int m=capacity.length;
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=apple[i];
        int count=0;
        for(int i=m-1;i>=0;i--)
        {
            if(sum<=0)
            break;
            sum-=capacity[i];
            count++;
        }
        return count;
    }
}