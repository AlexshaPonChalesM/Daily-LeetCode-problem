class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2];
        int k=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(s.contains(nums[i]))
            {
                arr[k++]=nums[i];
            }
            else
            s.add(nums[i]);
        }
        return arr;
    }
}