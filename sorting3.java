public class sorting3 {
    
    public static void selection(int arr[]){
        for(int turn =0;turn<arr.length-1;turn ++){
            int min=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[min]<arr[j]){
                    min =j;
                }
            }
            int temp= arr[min];
            arr[min]=arr[turn];
            arr[turn]=temp;
        }

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={4,3,5,1,2};
        selection(arr);
        print(arr);
    }
    

    
}
