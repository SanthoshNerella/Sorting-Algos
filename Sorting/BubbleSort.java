package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {2 , 6 , 3, 5, 9 , 8 , 1};
        System.out.println("before sorting: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
        bubbleSort(nums);
        System.out.println();
        System.out.println("after sorting: ");
        for(int num : nums){
            System.out.print(num + " ");
        }

    }
    public  static void bubbleSort(int[] arr){
        int size = arr.length;
        for(int i = 0 ; i < size; i++){
            for(int j = 0 ; j < size - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
