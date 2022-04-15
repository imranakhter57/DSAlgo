public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int n = digits.length;
        int[] ans = new int[n];
        int[] ansInc = new int[n+1];
        int carry=1;
        for(int i=n-1; i>=0;i--){
            if(digits[i]+carry >9){
                ans[i] = 0;
                carry =1;
            } else {
                ans[i] = digits[i]+carry; 
                carry=0;
            }
        }
        
        if(carry >0){
            ansInc[0]= carry;
            for(int i=0;i<n;i++){
                ansInc[i+1] = ans[i];
            }
            System.out.println(ansInc);
            return;
        }
        System.out.println(ans);
        return;
    }
}
