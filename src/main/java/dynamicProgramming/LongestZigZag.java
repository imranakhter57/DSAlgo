package dynamicProgramming;

public class LongestZigZag {
    public static void main(String[] args) {
        int[] nums = {1,17,5,10,13,15,10,5,16,8}; 
        int n = nums.length;
        int[] dp = new int[n];
        for(int i=1;i<n-1;i++){
            if(n ==2 && dp[0] != dp[1]) {
                dp[i] = 1;
            }
            if((nums[i-1] > nums[i] && nums[i] <nums[i+1]) || (nums[i-1] < nums[i] && nums[i] > nums[i+1])){
                dp[i] = dp[i-1]+1;
            } else {
                dp[i] = dp[i-1];
            }
        }
        System.out.println(dp[n-2]);
    }
}
