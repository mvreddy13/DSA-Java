public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 3, 2, 0};
        System.out.println(mountainBinarySearch(arr));
    }

    static int mountainBinarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // Descending part of the array.
                // mid might be the answer.
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
