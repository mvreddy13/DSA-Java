public class SearchInString {
    

    public static void main(String[] args) {
        String str = "Varun";
        char target = 'e';
        System.out.println(search(str, target));
    }

    static boolean search(String string, char target) {
        if(string == null) return false;
        for(int index = 0; index < string.length(); index++) {
            if(target == string.charAt(index)) return true;
        }
        return false;
    }
}
