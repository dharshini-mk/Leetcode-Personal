class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int n=x,s=0,a;
        while(n!=0)
        {
            a=n%10;
            s=(s*10)+a;
            n=n/10;
        }
        if(x==s)
            return true;
        else
            return false;
    }
}