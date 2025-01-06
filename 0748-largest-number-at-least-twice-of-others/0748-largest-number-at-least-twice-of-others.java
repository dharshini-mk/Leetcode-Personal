class Solution
{
    public int dominantIndex(int[] nums)
    {
        int[] a=new int[nums.length];
        for(int i=0;i<a.length;i++)
            a[i]=nums[i];
        Arrays.sort(a);
        if(a[a.length-1]>=a[a.length-2]*2)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(a[a.length-1]==nums[i])
                    return i;
            }
        }
        return -1;
    }
}