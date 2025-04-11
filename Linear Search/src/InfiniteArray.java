public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 13, 14, 15, 20, 23, 25, 30, 34, 39, 42, 44, 47, 51, 52, 56, 57, 61,
                65, 66, 70, 71, 76, 79, 80, 82, 83, 86, 87, 91, 93, 95, 97, 99, 101, 102, 104,
                109, 112, 116, 119, 124, 127, 129, 131, 135, 140, 144, 149, 154, 155, 160, 165,
                167, 168, 172, 174, 178, 181, 186, 187, 190, 195, 200, 205, 208, 209, 213, 215,
                219, 220, 221, 225, 228, 229, 232, 236, 237, 241, 242, 244, 249, 251, 256, 258,
                260, 262, 267, 269, 273, 275, 280, 284, 287, 291, 296, 300};
        int target = 80;
        System.out.printf("Index %d => %d",answer(arr, target), arr[answer(arr, target)]);

    }
    static int answer(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;

        }
        return binarySearch(arr, target, start, end );
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
