class Solution
{
    public int[] intersect(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> l=new ArrayList<>();   
        int i=0,j=0;     
        while(i<nums1.length&&j<nums2.length)
        {
                if(nums1[i]<nums2[j])
                    i++;
                else if(nums1[i]>nums2[j])
                    j++;
                else
                {
                    l.add(nums1[i]);
                    i++;
                    j++;
                }
        }
        int[] a=new int[l.size()];
        for(int k=0;k<l.size();k++)
            a[k]=l.get(k);
        return a;
    }
}