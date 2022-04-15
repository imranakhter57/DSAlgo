public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        int[] temp = new int[n+m];
        for(int i=0;i<m;i++){
            temp[i] = nums1[i];
        }
        int ind1 = 0;
        int ind2 = 0;
        int ind = 0;
        while(ind1 < m && ind2 < n){
            if(temp[ind1] < nums2[ind2]){
                nums1[ind] = temp[ind1];
                ind1++;
            } else {
                nums1[ind] = nums2[ind2];
                ind2++;
            }
            ind++;
        }

        while(ind1<m){
            nums1[ind] = temp[ind1];
            ind1++;
            ind++;
        }

        while(ind2<n){
            nums1[ind] = nums2[ind2];
            ind2++;
            ind++;
        }
        System.out.println("done");
    }
}
