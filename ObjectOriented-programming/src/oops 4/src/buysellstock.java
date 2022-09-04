public class buysellstock {
    public static void main(String[] args) {
//        not related to oops just  a leetcode question


    }
    static int stock(int[] prices)
    {
        int minprice = Integer.MAX_VALUE;
        int maxprofi = 0;
        for(int i =0; i<prices.length; i++)
        {
            if(prices[i]<minprice)
            {
                minprice= prices[i];
            }
            else if(prices[i]-minprice>maxprofi)
            {
                maxprofi=prices[i]-minprice;
            }
        }
        return maxprofi;
    }
}

