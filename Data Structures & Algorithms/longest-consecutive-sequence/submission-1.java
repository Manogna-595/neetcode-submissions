class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        List<Integer> starts = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            hm.add(nums[i]);
        }
        
        int max = 0;
        for(int k : hm){
            if(!hm.contains(k-1)){
                starts.add(k);
            }
        }

        for(int j : starts){
            int cur = 1;
            while(hm.contains(j+cur)){
                cur++;
            }
            if(cur>max){ max = cur;}
        }
        return max;
    }
}
