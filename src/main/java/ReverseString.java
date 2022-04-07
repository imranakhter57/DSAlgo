public class ReverseString {

    public static String reverseString(String s){
        if(s.length() == 0){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Imran"));
    }
}
