public class Arithmetic {
    public static int operations(String operator, int a, int b) {
        switch (operator) {
            case "addition" -> {
                return a + b;
            }
            case "subtraction" -> {
                return a - b;
            }
            case "multiplication" -> {
                return a * b;
            }
            case "division" -> {
                return a / b;
            }
        }
        return 0;
    }

    public static int fibonacci(int prev, int curr, int n) {
        for (int i = 1; i <= n; i++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;

        }
        return curr;
    }

    public static int countNum(int num, int target) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == target) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static int reverseNum(int num) {
        int reversedNum = 0;
        if (num > 0) {
            do {
                int rem = num % 10;
                reversedNum = reversedNum * 10 + rem;
                num = num / 10;
            } while (num > 0);
        }
        return reversedNum;
    }

    public static boolean isArmstrong(int num) {
        if (num < 0) {
            return false;
        }
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        return sum == originalNum;
    }
}
