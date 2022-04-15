public class SearchInsertPos {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target =2;
        for(int i=0; i< nums.length;i++){
            if(nums[i] == target){
                System.out.println(i);
                return;
            } else if(nums[i] > target){
                System.out.println(i);
                return;
            }
        }
        System.out.println(nums.length);
    }
}
