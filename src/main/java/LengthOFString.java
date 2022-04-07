public class LengthOFString {

    public static void main(String[] args) {
        String A = "ImranAkhtar";
        System.out.println(length(A,0));
    }
    
    public static int length(String S, int ind){
        try{
            S.charAt(ind);
        } catch (StringIndexOutOfBoundsException e){
            return 0;
        }
        return 1+length(S, ind+1);
    }
}
