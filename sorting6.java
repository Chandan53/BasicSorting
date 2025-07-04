import java.util.Arrays;
public class sorting6 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={6,5,8,3,4,1,2,7};
        Arrays.sort(arr);
        print(arr);
    }
    
}
