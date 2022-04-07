public class BrokenCalc {
    
    public static void main(String[] args) {
        int startValue = 2;
        int target = 3;
        int count = 0;
        while(startValue!=target){
            if(startValue < target && target%2 == 0){
                target = target/2;
            } else
                target = target+1;
            count++;
        }
        System.out.println(count);
    }
}
