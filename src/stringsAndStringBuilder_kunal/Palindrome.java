package stringsAndStringBuilder_kunal;

public class Palindrome {

    public static void main(String[] args) {
        String str = "Racecar";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }

        str = str.toLowerCase(); // convert the string to lower case

        for (int i = 0; i <= str.length() / 2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false; // means it is not a palindrome number
            }
        }
        return true;
    }
}
