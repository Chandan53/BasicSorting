public class sorting5 {

    // insertion sort --> pick an element from unsorted part & placed in the right position in sorted part
    
  
    public static void insertion(int arr[]){
       // start from the secont element assume that first element is already sorted
        for( int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev=i-1;
            // compare the current element with previous element
            // if the previous element is largest shift it to wards
            while(prev >=0 && arr[prev]> curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
              // find the correct positition and insert the current element
            arr[prev+1]=curr;
            
        }

    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertion(arr);
        print(arr);
    }
    
}
