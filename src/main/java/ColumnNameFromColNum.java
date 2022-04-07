public class ColumnNameFromColNum {

    public static void main(String[] args) {
        System.out.println(colName(470211273));
    }
    
    public static String colName(long n){
            // your code here
            char c ='A';
            if(n == 0){
                return "";
            }
            if(n%26==0){
                c='Z';
                n = n/26-1;
            } else {
                c=(char)(c+n%26-1);
                n=n/26;
            }
            return colName(n)+c;
    }
}
