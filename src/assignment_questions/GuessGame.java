package assignment_questions;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    // Leetcode ques: 374, uses binary search

    private static int pickedNumber;

    // Kinda useless part, can ignore
    static void GuessingGame(int maxRange) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        pickedNumber = random.nextInt(maxRange) + 1; // Random number between 1 and maxRange
    }

    // Kinda useless part as well
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
    static int guess(int num) {
        if (num < pickedNumber) {
            return 1; // Guessed number is lower
        } else if (num > pickedNumber) {
            return -1; // Guessed number is higher
        } else {
            return 0; // Guessed the correct number
        }
    }

    static int guessGame(int n){
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(guess(mid) == 0){
                return mid;
            }
            else if(guess(mid) == 1){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start; // or end
    }

    public static void main(String[] args) {

    }
}
