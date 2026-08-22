class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int m = s+(e-s)/2;

        while(s<=e){
                m = s+(e-s)/2; 
                if(nums[m]==target) return m;
                if(nums[m]>=nums[s]){
                    if(target>=nums[s] && target<nums[m]){
                    e=m-1;
                    }else{ s=m+1; }
                }else{
                    if(target>nums[m] && target<=nums[e]){
                    s=m+1;
                    }else{ e=m-1; }
                }  
        }
        
       return -1;
    }
}
