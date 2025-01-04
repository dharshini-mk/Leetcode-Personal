class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                m++;
                max=Math.max(m,max);
            }
            else 
                m=0;
        }
        return max;
    }
}