public class sqrt {
    public static void main(String[] args) {
        int x = 16;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        int startNum = 0;
        int end = x;
        while (startNum <= end) {
            int middle = startNum + (end - startNum) / 2;
            long square = (long) middle * middle;
            if(square > x) {
                end = middle - 1;
            } else if(square < x){
                startNum = middle + 1;
            } else {
                return middle;
            }

        }
        return end;
    }
}
