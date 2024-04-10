package assignment_questions;

public class NumberOfStudentUnableToEatLunch {
    // Leetcode 1700
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        int ans = countStudents(students, sandwiches);
        System.out.println(ans);
    }

    static int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int student : students) {
            count[student]++;
        }

        int remaining = sandwiches.length;
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                break;
            }
            if (remaining-- == 0) {
                break;
            }
            count[sandwich]--;
        }
        return remaining;
    }
}
