class Solution {
    public int maximum69Number (int num) {
        int max=num;
        int temp=max;
        int p=1;
        while(temp>1)
        {
            int rem=temp%10;
            if(rem==6)
            {
                max=Math.max(max,num+(p*3));
                p*=10;
            }
            else
            {
                max=Math.max(max,num-(p*3));
                p*=10;
            }
            temp/=10;
        }
        return max;
    }
}