import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter which arithmetic operation to perform: Addition, Subtraction, Multiplication, Division, ");
//        String operation = sc.nextLine().toLowerCase();
//        System.out.println("Enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int num2 = sc.nextInt();
//        System.out.println(Arithmetic.operations(operation, num1, num2));
//        System.out.println("Enter 1st number in the fibonacci sequence: ");
//        int a = sc.nextInt();
//        System.out.println("Enter 2nd number in the fibonacci sequence: ");
//        int b = sc.nextInt();
//        System.out.println("Enter the desired position number in the fibonacci sequence: ");
//        int c = sc.nextInt();
//       System.out.println(Arithmetic.fibonacci(a, b, c));
//        System.out.println("Enter number: ");
//        int number = sc.nextInt();
//        System.out.println("Enter target number: ");
//        int target = sc.nextInt();
//        System.out.println("The count of target number is: " + Arithmetic.countNum(number, target));
//        System.out.println("Enter a number to reverse it: ");
//        int num = sc.nextInt();
//        System.out.println("This the reverse of "+ num + ": " + Arithmetic.reverseNum(num));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArr(arr);
    }

    static void reverseArr(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}