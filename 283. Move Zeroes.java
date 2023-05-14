class Solution {
    public void moveZeroes(int[] nums) {
      int n = nums.length;
        if (n<2) return;
        int p1=0, p2=1;
        while (p2<n){
           if (nums[p1]!=0){
               ++p1;
               ++p2;
           }
           else if (nums[p2]==0) ++p2;
           else {
               int temp = nums[p1];
               nums[p1] = nums[p2];
               nums[p2] = temp;
           }
        }  
    }
}