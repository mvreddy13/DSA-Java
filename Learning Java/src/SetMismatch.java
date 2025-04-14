import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int[] newArray = findErrorNums(nums);
        System.out.println(Arrays.toString(newArray));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex] && nums[i] != i + 1) {
                Sorting.swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                return new int[] {nums[j], j + 1};
            }
        }

        return new int[] {-1, -1};
    }
}
