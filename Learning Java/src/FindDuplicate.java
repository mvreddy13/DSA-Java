import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        sortFunction(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortFunction(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums.length - 1;
            if(nums[i] != nums[correctIndex] && nums[i] != i + 1) {
                Sorting.swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }
}
