package dynamicProgramming;

import java.math.BigInteger;

public class NCathlanNumber {
    public static void main(String[] args) {
        int n = 8;
        BigInteger[] dp = new BigInteger[n];
        dp[0]=BigInteger.ONE;
        if(n>1)
            dp[1] =BigInteger.ONE;
        for(int i=2;i<n;i++){
            dp[i] = findCathlanAtN(dp,i);
        }
        System.out.println(dp[n-1]);
    }
    
    public static BigInteger findCathlanAtN(BigInteger[] dp, int n){
        BigInteger ans = BigInteger.ZERO;
        for(int i=0;i<n/2;i++){
            ans = ans.add(BigInteger.TWO.multiply(dp[i]).multiply(dp[n-i-1]));
            if(n%2==1 && i == n/2-1) {
                ans = ans.add(dp[i+1].multiply(dp[i+1]));
            }
        }
        return ans;
    } 
}
