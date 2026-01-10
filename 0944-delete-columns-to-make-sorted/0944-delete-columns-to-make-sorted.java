class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int n=strs.length;
        int m=strs[0].length();
        for(int j=0;j<m;j++)
        {
           int i=0;
           char val=strs[i].charAt(j);
           while(i<n)
           {
            if(strs[i].charAt(j)>=val)
            {
                val=strs[i].charAt(j);
                i++;
            }
            else {
                count++;
                break;
            }
           }
        }
        return count;
    }
}