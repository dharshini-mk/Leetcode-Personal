class Solution {
    public int heightChecker(int[] heights) {
        int[] a=new int[heights.length];
        for(int i=0;i<heights.length;i++)
            a[i]=heights[i];
        Arrays.sort(heights);
        int n=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=heights[i])
                n++;
        }
        return n;
    }
}