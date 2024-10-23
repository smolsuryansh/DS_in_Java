package trees_kunal;

import java.util.Stack;

public class DFSUsingStack {

    void dfsStack(TreeNode node) {
        if(node == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            TreeNode removed = stack.pop();
            System.out.println(removed.val + " ");

            // check if removed node has left and right children
            if (removed.right != null) {
                stack.push(removed.right);
            }
            if (removed.left != null) {
                stack.push(removed.left);
            }
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
