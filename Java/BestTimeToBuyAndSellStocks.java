public class BestTimeToBuyAndSellStocks {
    
}
class Solution {
    public int maxProfit(int[] prices) {
        int net=0; 
        int buy=Integer.MAX_VALUE; 
        int sell=Integer.MIN_VALUE;
        for(int i=0; i<prices.length-1; i++){    
            if(buy>prices[i]){
                buy=prices[i];
            } else{
                continue;
            }
            for(int j=i+1; j<prices.length; j++){
                sell=prices[j];
                int xnet= sell-buy;
                if(net<xnet){
                    net=xnet;
                }
            }
        }
        return net;
    }
}