import java.util.Arrays;

public class IsArrayConatinDublicate {

    public static boolean isConatinas(int[] arr) {

    Arrays.sort(arr);

    for(int i=0;i<arr.length-1;i++ ) {
        if(arr[i]==arr[i+1]) {
            return true;
        }
    }
    
    return false;
    }
    
    public static void main(String[] args) {
    
    int arr[]={2,3,6,0,4,-5,-8,-4};
    System.out.println("arrays is ");
    

    if(isConatinas(arr)){
        System.out.println("yes arrays Conatins Dublicates ");
    
    } 
    else{
        System.out.println("Arrays Does not contains Dublicates ");
    }

    // for(int i=0;i<arr.length;i++) {
        
    //     System.out.print(arr[i]+" ");
    // }

    // Arrays.sort(arr);

    // System.out.println("Arrays afte sort ");
    //  for(int i=0;i<arr.length;i++) {
        
    //     System.out.print(arr[i]+" ");
    // }


    }
}
