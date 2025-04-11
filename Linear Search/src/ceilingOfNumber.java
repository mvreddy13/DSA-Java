import java.util.Arrays;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr= {2, 4, 6, 8, 10, 11, 14, 16};
        int target = 12;
        System.out.println(Arrays.toString(ceiling(arr, target)));
    }

    public static int[] ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return new int[]{-1, -1};
        }

        while (start <= end) {

            int middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return new int[]{arr[middle], middle};

            } else if (arr[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return new int[]{arr[start], start};
    }
}
