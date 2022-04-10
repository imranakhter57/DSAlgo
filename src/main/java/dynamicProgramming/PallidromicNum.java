package dynamicProgramming;

public class PallidromicNum {

    public static void main(String[] args) {
        String S = "aaaabbaa";
        String[][] dp = new String[S.length()][S.length()];
        String ans = "";
        for(int g=0;g<S.length();g++){
            for(int i=0,j=g; j<S.length();j++,i++){
                String sub = S.substring(i,j+1);
                if (g == 0) {
                    dp[i][j] = sub;
                    if(ans.length() < sub.length())
                        ans = sub;
                } else if (g == 1) {
                    if (S.charAt(i) == S.charAt(j)) {
                        dp[i][j] = sub;
                        if(ans.length() < sub.length())
                            ans = sub;
                    }
                } else {
                    if (S.charAt(i) == S.charAt(j) && dp[i + 1][j - 1] != null) {
                        dp[i][j] = sub;
                        if(ans.length() < sub.length())
                            ans = sub;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
