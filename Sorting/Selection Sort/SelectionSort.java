 /**
  * SelectionSort
  */
 public class SelectionSort {
    public static void selectionSort(int[] arr) {
       
        for(int i = 0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[min]) {
                   
                    min = j;
                }
            }
            if (min!=i) {
                swap(arr, i,min);
            }
            
        }
        
    }
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,2,8,1,9,3};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
 }