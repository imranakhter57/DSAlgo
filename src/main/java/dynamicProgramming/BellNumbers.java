package dynamicProgramming;

public class BellNumbers {

    public static void main(String[] args) {
        int n = 3;
        int[][] dp = new int[n][n];
        int ans = 0;
        dp[0][0] = 1;
        for(int i=1;i<n;i++){
            dp[i][0] = dp[i-1][i-1];
            bellNumberAtN(dp,i);
        }
        System.out.println(dp[n-1][n-1]);
    }
    
    public static void bellNumberAtN(int[][] dp,int i){
        for(int j=1;j<i+1;j++){
            dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
        }
    }
}
