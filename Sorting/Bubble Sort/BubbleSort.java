/**
 * BubbleSort implementation
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
       
        for(int i = 0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    swapped = true;
                    swap(arr, j+1, j);
                }
            }
            if (!swapped) {
                break;                
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
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    
}

