class Solution {
    public int countCollisions(String directions) {
        char []arr=directions.toCharArray();
        int n=directions.length();
        int left=0,right=n-1;
        while(left<n && arr[left]=='L')
        left++;
        while(right>=0 && arr[right]=='R')
        right--;
        int coll=0;
        for(int i=left;i<=right;i++)
        {
            if(arr[i]=='L'||arr[i]=='R')
            coll++;
        }
        return coll;
    }
}