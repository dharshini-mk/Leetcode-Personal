class Solution {
    public int findLucky(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        int m=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==nums[i])
                m=nums[i];
        }
        return m;
    }
}