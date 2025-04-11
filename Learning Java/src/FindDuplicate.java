public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int duplicateNum = sortFunction(nums);
        System.out.println(duplicateNum);
    }

    static int sortFunction(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums.length - 1;
            if(nums[i] != i + 1) {
                if(nums[i] != nums[correctIndex]){
                    Sorting.swap(nums, i, correctIndex);
                } else {
                    return nums[correctIndex];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
