package trees_kunal;

import java.util.LinkedList;
import java.util.Queue;

// leetcode 114
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        TreeNode current = root;

        while(current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;

                while(temp.right != null) {
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    public void bruteFlatten(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            queue.offer(root.left);
            queue.offer(root.right);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
