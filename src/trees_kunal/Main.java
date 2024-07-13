package trees_kunal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(sc);
//        tree.prettyDisplay();

        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        bst.populateSorted(nums);
        bst.display1();
    }
}
