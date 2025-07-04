import java.util.Arrays;
public class sorting7 {
    public static void  print(int arr[]){
        for ( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,5,3,6,4,3,2};
        Arrays.sort(arr,0,5);
        // (arr, si,ei)
        // starting index is inclusive
        // ending index is enclusive
        print(arr);
    }
    
}
