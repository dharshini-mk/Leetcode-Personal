class Solution
{
    public int removeElement(int[] nums, int val)
    {
        int n=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                l.add(nums[i]);
                n++;
            }
        }
        for(int i=0;i<l.size();i++)
            nums[i]=l.get(i);
        return n;
    }
}