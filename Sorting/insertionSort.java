package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums = {2,6,1,4,9,3,7};
            System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
        for(int i = 1 ;i < nums.length ; i++){
            int key = nums[i];
            int j = i - 1;
            while( j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        System.out.println();
        System.out.println("After sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
