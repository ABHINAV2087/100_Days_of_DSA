public class InsertionSort {
    public static void InsertionSort(int [] arr){
        for(int i =1;i<arr.length;i++){
            int j = i-1;
            int key = arr[i];
            while(j>-1 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,2,8,1,9,3};
        InsertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}