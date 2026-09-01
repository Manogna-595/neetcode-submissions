class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i=1; i<dp.length ;i++){
            dp[i] = amount+1;
        }
        
        for(int a=1; a<amount+1 ;a++){
            for(int c : coins){
                if(a-c >= 0){
                    dp[a] = Math.min(dp[a], dp[a-c]+1);
                }
            }
        }
        if(dp[amount] < (amount+1)) return dp[amount];
        else return -1;
    }
}
