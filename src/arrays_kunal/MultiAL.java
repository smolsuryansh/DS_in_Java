package arrays_kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // 2D ARRAY

        // Initializing array list
        for (int i = 0; i < 3; i++) { // 3 is row
            list.add(new ArrayList<>());
        }

        // Adding elements
        for (int i = 0; i < 3 ; i++) { // 3 rows
            for (int j = 0; j < 3; j++) { // 3 columns
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
