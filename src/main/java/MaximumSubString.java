public class MaximumSubString {
    
    public static void main(String[] args) {
        String A = "GEEKSFORGEEKS";
        String B= "YOUAREAGEEK";
        String ans = "";
        String[][] dp = new String[A.length()+1][B.length()+1];
        for(int i=0;i< A.length();i++){
            dp[i][0] = "";
        }
        
        for(int i=0;i<B.length();i++){
            dp[0][i] = "";
        }
        
        for(int i=0; i<A.length();i++){
            for (int j=0;j<B.length();j++){
                if(A.charAt(i)==B.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+A.charAt(i);
                    if(ans.length() < dp[i+1][j+1].length()){
                        ans = dp[i+1][j+1];
                    }
                } else {
                    dp[i+1][j+1]="";
                }
            }
        }
        System.out.println(ans);
    }
}
