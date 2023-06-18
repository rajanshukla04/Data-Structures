public class SumOfSubarray{

    public static void main(String[] args) {
        int arr[]={2,3,-5,6,0,4,-5,-8,-4,-4};

        int max=-1000;
        int sum=0;

        for(int i=0;i<arr.length;i++) {
            sum=sum+arr[i];
            // if(max<sum) {
            //     max=sum;
            // }
            
            max=Math.max(max,sum);
            if(sum<0) {
                sum=0;
            }
        }

        System.out.println("Sum of maximum Subarray is "+max);

    }
}