public class InvertNumber {

    public static void main(String[] args) {
        int A =0;
        String s = String.valueOf(A);
        String ans = "";
        int mid = s.length()%2==0?s.length()/2: (s.length()/2)+1;
        for(int i=0; i<mid; i++){
            ans=ans+s.charAt(i);
            if(s.length()/2!=i){
                ans=ans+s.charAt(s.length()-1-i);
            }
        }
        System.out.println(ans);
    }
}
