int subtractProductAndSum(int n) {
    int p=1;
    int sum =0;
    int digit;
    while (n!=0){
        digit=n%10;
        p=p*digit;
        sum = sum+digit;
        n=n/10;
    }
    return (p-sum);
    
    
}
