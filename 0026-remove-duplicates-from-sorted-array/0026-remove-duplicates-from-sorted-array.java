class Solution
{
    public int removeDuplicates(int[] nums)
    {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        List<Integer> l=new ArrayList<Integer>(set);
        for(int i=0;i<l.size();i++)
            nums[i]=l.get(i);
        int n=set.size();
        return n;
    }
}