import java.util.Collections;
import java.util.Arrays;
public class sorting8 {
    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[]={4,6,7,8,9,5,1,2,3};
        Arrays.sort(arr , Collections.reverseOrder());
       
        print(arr);
    }
    
}
