package Sorting;
public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {9 , 5, 2, 1 , 4, 7};
        System.out.println("Before Sorting:");
        for(int num : nums){
            System.out.print(num + " ");
        }
        selectionSort(nums);
    }
    public static void selectionSort(int[] arr){
        // int minIndx = -1;
        int size = arr.length;
        for(int i = 0 ; i < size - 1 ; i++){
            int minIndx = i;
            for(int j = i + 1 ; j < size ; j++){
                if(arr[minIndx] > arr[j]){
                    minIndx = j ;
                }
            }
            int temp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.println("After Sorting:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
