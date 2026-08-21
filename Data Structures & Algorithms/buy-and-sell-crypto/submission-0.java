class Solution {
    public int maxProfit(int[] prices) {
        int bp = prices[0];
        int p = 0;
        int max = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<bp){
                bp = prices[i];
            }else{
                p = prices[i] - bp;
                max = Math.max(max,p);
            }
        }

        return max;
    }
}
