package binarysearch_kunal;

public class FindSmallestLetter {

    // Find smallest letter greater than target. Leetcode: 744
    static char SmallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }


    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'e', 'g'};
        char target = 'c';
        char ans = SmallestLetter(letters, target);
        System.out.println(ans);
    }
}
