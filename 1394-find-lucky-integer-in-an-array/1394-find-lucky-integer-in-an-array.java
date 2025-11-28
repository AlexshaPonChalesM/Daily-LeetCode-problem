class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int max=Arrays.stream(arr).max().getAsInt();
        int fre[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            fre[arr[i]]++;
        }
        for(int i=max;i>0;i--)
        {
            if(fre[i]==i)
            return i;
        }
        return -1;
    }
}