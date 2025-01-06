class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>nums.length/3)
                set.add(nums[i]);
        }
        List<Integer> l=new ArrayList<>(set);
        return l;
    }
}