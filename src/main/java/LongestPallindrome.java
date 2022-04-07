public class LongestPallindrome {

    public static void main(String[] args) {
        String s = "abcdcbaebe";
            String palin = "";
            boolean check [][] = new boolean[s.length()][s.length()];
            for(int g=0; g<s.length();g++){
                for(int i=0,j=g; j<s.length();i++,j++){
                    if(g==0){
                        check[i][j] = true;
                    } else if(g==1){
                        check[i][j] = s.charAt(i) == s.charAt(j);
                    } else {
                        if(s.charAt(i)==s.charAt(j) && check[i+1][j-1]){
                            check[i][j] = true;
                        }
                    }
                    if(check[i][j]){
                        palin = s.substring(i,j+1);
                    }
                }
            }
        System.out.println(palin);
    }
}
