class Solution {
    public int reverse(int x) {
        int rd=0;
        int rem ;
        while(x!=0){
        rem= x%10;
        if(rd>Integer.MAX_VALUE/10 || rd< Integer.MIN_VALUE/10){
            return 0;
        }
        rd=rd*10+rem;
        x=x/10;
        }
        return rd;
    }
}
