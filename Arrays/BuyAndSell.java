public class BuyAndSell {

    // best time to buy and sell the share 
    // using the for we have to find the maxium profit 
    // buy in minmum price and sell in maxium price 
    // we have given only price share at differn time frame 


    public static int MaxProfit(int[] arr) {

        int minv=arr[0];
        int maxv=0;

        for(int i=0;i<arr.length;i++) {
            minv=Math.min(minv, arr[i]);
            int profit=arr[i]-minv;
            maxv=Math.max(maxv, profit);
        }

        return maxv;


    }

    public static void main(String[] args) {
        

        // price of any share 

    int[] price={25,26,28,10,20,30,40,30,20,5};

    System.out.println("maxium profit is "+MaxProfit(price));

    }
    
}
