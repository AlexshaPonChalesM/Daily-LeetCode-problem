class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0 || k%10==0)
        return -1;
        int sum=1;
        for(int i=1;i<=k;i++)
        {
            if(sum%k==0)
            {
                return i;
            }
            sum=((sum*10)+1)%k;
        }
        return -1;
    }
}