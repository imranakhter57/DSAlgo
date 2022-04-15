public class CountPathOfStairs {
    public static void main(String[] args) {
        int n =44;
        System.out.println(countPath(n,new int[n+1]));
        System.out.println(countPathByTabulation(n));
    }

    private static int countPath(int n, int[] qb){
        if(n==0){
            return 1;
        } else if(n<0){
            return 0;
        }

        if(qb[n]>0){
            return qb[n];
        }
        qb[n] = countPath(n-1,qb)+countPath(n-2,qb);
        return qb[n];
    }
    
    private static int countPathByTabulation(int n){
        int[] qb = new int[n+1];
        qb[0] = 1;
        for(int i=1;i<=n;i++){
            qb[i] = qb[i-1] + (i>1?qb[i-2]:0); 
        }
        return qb[n];
    }
}

