import java.util.Scanner;

public class Test {
    
    public static void pallin(int a,int b, int n){
        if(n == 0){
            return ;
        }
        System.out.println(a+b);
        pallin(b,a+b, n-1);
    }

    public static void main(String[] args) {
        int a= 0;
        int b= 1;
        /*int n = new Scanner(System.in).nextInt();
        System.out.println(a);
        if(n ==1){
            return;
        }
        System.out.println(b);
        if(n==2){
            return;
        }
        pallin(a,b,n-2);*/
        int n =5;
        int k=73;
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = 'a';//initialize all array element with 'a'
            k--;
        }
        int numValue;
        while (k > 0) {
            numValue = Math.min(25, k);//building the string from the end to the beginning, it will always be optimal.
            result[--n] += numValue;
            k -= numValue;
        }
        System.out.println(String.valueOf(result));

    }
}
