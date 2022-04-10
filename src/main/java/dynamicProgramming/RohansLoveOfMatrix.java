package dynamicProgramming;

import java.util.Arrays;

public class RohansLoveOfMatrix {
    public static void main(String[] args) {
        int n = 19585;
        long[] dp = new long[n];
        int mod = 1000000007;
        dp[0] =1;
        if(n>1)
            dp[1] = 1;
        if(n>2) {
            for (int i = 2; i < n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
            }
        }
        System.out.println(dp[n-1]);
    }
}
