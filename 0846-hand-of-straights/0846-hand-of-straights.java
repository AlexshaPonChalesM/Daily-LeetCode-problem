class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize != 0)
        return false;  
        Arrays.sort(hand);
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(hand[i]);
        }
        for(int i=0;i<n/groupSize;i++)
        {
            int val=l.get(0);
            l.remove(0);
            for(int j=0;j<groupSize-1;j++)
            {
                if(l.contains(val+1))
                {
                    int index=l.indexOf(val+1);
                    l.remove(index);
                    val+=1;
                }
                else return false;
            }
        }
        if(l.size()==0)return true;
        return false;
    }
}