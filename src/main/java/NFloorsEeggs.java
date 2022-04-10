public class NFloorsEeggs {
    public static void main(String[] args) {
        int N = 100;
        int E= 2;
        
        int[][] dp = new int[N+1][E+1];
        
        for(int i =1; i<E+1;i++){
            dp[1][i] = 1;
        }
        
        for(int i=1; i <N+1 ;i++){
            dp[i][1] = i;
        }
        
        for(int i=2; i<N+1;i++){
            for(int j=2; j<E+1;j++){
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x < i; x++) {
                    final int brokenEggResult = dp[x - 1][j - 1];
                    final int EggSurvivedResult = dp[i - x][j];
                    int temp = Math.max(brokenEggResult, EggSurvivedResult) + 1;
                    if (temp < dp[i][j]) {
                        dp[i][j] = temp;
                    }
                }
            }
        }

        System.out.println(dp[N][E]);
    }
}
