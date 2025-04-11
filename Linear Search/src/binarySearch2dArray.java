import java.util.Arrays;

public class binarySearch2dArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 16;
        System.out.println(Arrays.toString(binarySearch(matrix, target)));
    }
    static int[] binarySearch(int[][] matrix, int target){
        int row = 0, col = matrix.length -1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }
            if(matrix[row][col] < target){
                row++;
            } else {
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}
