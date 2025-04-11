import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ascendingArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] descendingArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = ascendingArr.length / 2;

        int max = Arrays.stream(ascendingArr).max().getAsInt();
        System.out.println(max);
        System.out.println(Arrays.toString(shuffle(ascendingArr, n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int index = 0; index < n; index++) {
            arr[index] = nums[index];
            arr[index + 1] = nums[index + n];
        }
        return arr;
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(isAscending){
                if(target > arr[mid]) {
                    start = mid +  1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid +  1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
