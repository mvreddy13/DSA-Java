public class minimumNumber {

    public static void main(String[] args) {
        int[][] matrix = {
                {-100, 2, 3},
                {4, 5, 6},
                {7, 8, 1}
        };
        int[] result = minimumNum(matrix);

        System.out.printf("Minimum number in the given matrix is %d in %d row, %d column%n",result[0], result[1] +1, result[2] +1 );
        System.out.println(maxNum(matrix));
    }

    static int[] minimumNum(int[][] arr) {
        if(arr == null) return new int[0];
        int min = arr[0][0];
        int row = 0, col = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    return new int[]{min, row, col};
                }
            }
        }
        return new int[] {-1, -1, -1};
    }

    static int maxNum(int[][] arr) {
        if(arr == null) return 0;

        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        } return max;
    }
}
