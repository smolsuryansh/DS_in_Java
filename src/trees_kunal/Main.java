package trees_kunal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(sc);
//        tree.prettyDisplay();

//        BinarySearchTree bst = new BinarySearchTree();
//        int[] nums = {1,2,3,4,5,6,7,8,9};
//        bst.populateSorted(nums);
//        bst.display1();

        AVL tree = new AVL();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
}
