class Solution {
    public int maxArea(int[] heights) {
        
        int n = heights.length;
        int l=0;
        int r = n-1;
        int cur=0;
        int max = cur;

        while(l<r){
            cur = (r-l)*Math.min(heights[l],heights[r]);
            max = Math.max(max,cur);

            if(heights[l]<heights[r]){ l++; }
            else{ r--; }
        }

        return max;
        
    }
}
