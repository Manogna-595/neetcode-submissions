class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int m = s+(e-s)/2;

        while(s<e){
            if(nums[m]>nums[e]){
                s = m+1;
            }else{
                e=m;
            }
            m = s+(e-s)/2;
        }

        return nums[s];
    }
}
