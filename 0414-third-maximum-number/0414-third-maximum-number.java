class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length<3)
            return nums[nums.length-1];
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        List<Integer> list=new ArrayList<Integer>(set);
        if(set.size()<3)
            return set.last();
        return list.get(list.size()-3);
    }
}