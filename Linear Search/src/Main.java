public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{22, 3, 4, 5, 34, 7865, 756, 576, 756, 675, 562, 2436, 265, 256, 6524, 654, 652, 25, 72, 682};
        System.out.println(searchInRange(arr, 562, 5, 15));
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr == null || arr.length == 0) return -1;
        for (int index = start; index < end; index++)
            if (arr[index] == target) {
                return index;
            }
        return -1;
    }

    static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;
        for (int index = 0; index < arr.length; index++)
            if (arr[index] == target) {
                return index;
            }
        return -1;
    }

    static boolean search2(int[] arr, int target){
        if(arr == null) return false;
        for(int element: arr){
            if(element == target) {
                return true;
            }
        }
        return false;
    }
}
