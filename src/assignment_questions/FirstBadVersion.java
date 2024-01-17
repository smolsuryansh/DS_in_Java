package assignment_questions;

public class FirstBadVersion {

    // Leet code ques 278

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*
    static int firstBadVersion(int n){
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(isBadVersion(mid)){ // it has some of its own api idk check out the leetcode ques
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start; // or end
    }
*/
    public static void main(String[] args) {

    }
}
