public class PartitionArray {

    public static void main(String[] args) {
        int[] A = {1,15,7,9,2,5,10};
        int K= 3;
        int n = A.length;
        int[] dp = new int[n];
        dp[0] = A[0];
        int max = A[0];
        for(int i=1;i<K;i++){
            max=Math.max(max,A[i]);
            dp[i] = max*(i+1);
        }
        for(int i=K;i<n;i++){
            int subArrayMax = A[i];
            for(int subArraySize = 1; subArraySize<=K;subArraySize++){
                subArrayMax = Math.max(subArrayMax, A[i-subArraySize+1]);
                dp[i] = Math.max(dp[i],dp[i - subArraySize]+subArraySize*subArrayMax);
            }
        }
        System.out.println(dp[n-1]);
    }
}
