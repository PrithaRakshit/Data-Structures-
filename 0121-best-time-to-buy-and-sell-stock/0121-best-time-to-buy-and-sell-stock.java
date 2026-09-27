import java.util.*;
class Solution {
    public static int maxProfit(int prices[] ) {
       int buyPrice=Integer.MAX_VALUE;
        int profitMax=0;
        int profit;
        for(int i=0 ; i<prices.length ; i++){
        if(buyPrice<prices[i]){
            profit=prices[i]-buyPrice;
            profitMax=Math.max(profitMax , profit);
        }else {
            buyPrice=prices[i];
        }
        }
        return profitMax;
    }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int prices[]= new int[n];
            for(int i=0 ; i<n ; i++){
                prices[i]=sc.nextInt();
            }
            System.out.println(maxProfit(prices));
        }
}