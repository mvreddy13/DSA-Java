public class smallestletterGreaterThanTarget {
    public static void main(String[] args) {
        char[] chars = {'c', 'f', 'j'};
        char target = 'd';
        System.out.println(nextGreatestLetter(chars, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (letters[middle] == target) {
                start = middle + 1;
            } else if (letters[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return letters[0];
    }
}
