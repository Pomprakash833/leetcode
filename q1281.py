class Solution(object):
    def subtractProductAndSum(self, n):
        p=1
        s=0
        
        while n!= 0:
            digit = n%10
            p=p*digit
            s=s+digit
            n=n//10
        return p-s

        
       
        
