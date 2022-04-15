public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[ind] = nums[i];
                ind++;
            }
        }
        System.out.println(ind+1);
    }
}
