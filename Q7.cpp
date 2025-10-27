class Solution {
public:
    int reverse(int x) {
        int rem;
        int rd=0;
        while(x!=0){
        rem=x%10;
        if(rd>INT_MAX/10 || rd<INT_MIN/10){
            return 0;
        }
        rd=rd*10+rem;
        x=x/10;


    }
    return rd;
    }
};
