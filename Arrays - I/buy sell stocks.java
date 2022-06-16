class Solution {
    public int maxProfit(int[] prices) {
        
        int maxSum = 0,min = Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            if(prices[i]-min > maxSum){
                maxSum = prices[i]-min;
            }
        }
         
        return maxSum;
        
    }
}