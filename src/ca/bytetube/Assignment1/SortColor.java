package ca.bytetube.Assignment1;

public class SortColor {
    public void sortColors(int[] nums) {
        int less = 0;
        int more = nums.length - 1;
        int pivot = 0;
        while (pivot <= more) {
            if (nums[pivot] == 0) {
                int temp = nums[less];
                nums[less] = nums[pivot];
                nums[pivot] = temp;
                less++;
                pivot++;
            } else if (nums[pivot] == 1) {
                pivot++;
            } else if (nums[pivot] == 2) {
                int temp = nums[more];
                nums[more] = nums[pivot];
                nums[pivot] = temp;
                more--;
            }
        }
    }
}
