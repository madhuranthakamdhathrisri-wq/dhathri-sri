class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while(n != 0){
            int lastDigit = n%10;
            prod = prod * lastDigit;
            sum = sum + lastDigit;
            n = n/10;
        }
        return prod - sum;
    }
}
