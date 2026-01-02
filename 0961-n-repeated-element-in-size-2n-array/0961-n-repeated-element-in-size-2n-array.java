class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }   
        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            if(entry.getValue()==n)
            {
                return entry.getKey();
            }
        }
        return 1;
    }
}