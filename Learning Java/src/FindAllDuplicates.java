import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> duplicateNums = sortFunction(nums);
        System.out.println(duplicateNums);
    }

    static List<Integer> sortFunction(int[] nums) {
        int i = 0;
        List<Integer> duplicateNums = new ArrayList<>();
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex] && nums[i] != i + 1) {
                Sorting.swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                duplicateNums.add(nums[j]);
            }
        }

        return duplicateNums;
    }
}
