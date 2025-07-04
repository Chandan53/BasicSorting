public class sorting2 {
    // in bubble sort we  select the big element from the first and push it at the back
    // in selection sort we used to take out the smallest element from the end and put it on the first
    public static void selectionsort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int min = turn;
            for(int j=turn+1;j<arr.length ;j++){
                if(arr[min] > arr[j]){
                    min= j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[turn];
            arr[turn]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={4,2,5,7};
        selectionsort(arr);
    }
}
