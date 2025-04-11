import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missingNums = cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingNums);
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static int getMinIndex(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i <= end; i++) {
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void BubbleSort(int[] arr) {
        boolean swapped;
        for(int i = 0;i < arr.length ; i++) {
            swapped = false;
            for(int j = 1; j < arr.length - i ; j++) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, arr[j], arr[j - 1]);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }

    static void SelectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0,last );
            swap(arr, maxIndex, last);
        }
    }

    static void SelectionSortMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinIndex(arr, i, arr.length - 1);
            swap(arr, minIndex, i);
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j, j -1);
                } else {
                    break;
                }
            }
        }
    }

    static List<Integer> cyclicSort(int[] arr) {
        int i = 0;
        List<Integer> missingNums = new ArrayList<>();
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex] && arr[i] != i + 1) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                missingNums.add(index + 1);
            }
        }
        return missingNums;
    }
}
