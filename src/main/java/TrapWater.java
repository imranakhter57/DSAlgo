public class TrapWater {

    public static void main(String[] args) {
        int[] height = {3,0,2,0,4};
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int ans = 0;
        int leftPointer = 1;
        int rightPointer = height.length-2;
        for(int i=1; i<height.length-1;i++){
            if(height[leftPointer]> leftMax){
                leftMax = height[leftPointer];
                leftPointer++;
            }
            else if(leftMax < rightMax){
                ans+=leftMax - height[leftPointer];
                leftPointer++;
            } else if (height[rightPointer]> rightMax){
                rightMax = height[rightPointer];
                rightPointer--;
            }
            else  {
                ans+=rightMax-height[rightPointer];
                rightPointer--;
            }
        }
        
        System.out.println(ans);
    }
}
