public class ArmstrongNum {
    public static void main(String[] args) {
        int a = 1634;
        int temp = a;
        int ans = 0;
        int n = 0;
        while(temp>0){
            temp = temp/10;
            n++;
        }
        int pow=n;
        while(n>0){
            ans += Math.pow(a%10,pow);
            a = a/10;
            n--;
        }
        System.out.println(ans);
    }
}
