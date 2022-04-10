public class PrintAllPallindromicSubSeqDP {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaa";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < s.length(); i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                    ans += 1;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                        ans += 1;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        ans += 1;
                    }
                }
            }
        }
        System.out.println((int)(ans%(Math.pow(10,9)+7)));
    }
}
