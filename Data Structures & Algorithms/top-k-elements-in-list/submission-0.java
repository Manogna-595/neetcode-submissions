class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length+1];

        for(int v : hm.keySet()){
            if(bucket[hm.get(v)]==null){
                bucket[hm.get(v)] = new ArrayList<>();
            }
            bucket[hm.get(v)].add(v);
        }

        int[] ans = new int[k];
        int ind = 0;

        for(int i=bucket.length-1;i>=0 && ind<k ;i--){
            if(bucket[i]!=null){
                for(int m : bucket[i]){
                    ans[ind++] = m;
                }
                
            }
        }
        return ans;
    }
}
