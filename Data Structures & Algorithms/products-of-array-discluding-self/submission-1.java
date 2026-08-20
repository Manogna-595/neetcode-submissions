class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] output = new int[n];
        int pp = 1;
        int sp = 1;
        prefix[0] = 1;
        suffix[n-1] = 1;

        for(int i=1;i<n;i++){
             pp= pp*nums[i-1];
             prefix[i] = pp;
        }

        for(int i=n-2;i>=0;i--){
             sp= sp*nums[i+1];
             suffix[i] = sp;
        }

        for(int i=0;i<n;i++){
            output[i] = suffix[i] * prefix[i];
        }

        return output;
    }
}  
