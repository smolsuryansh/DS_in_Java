package trees_kunal;

import java.util.*;

public class BinaryTreeZigZagLevelOrderTraversal {
    // leetcode 103

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // flag check
        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {

                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst(); // removed element
                    currentLevel.add(currentNode.val);

                    if(currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = queue.pollLast(); // removed element
                    currentLevel.add(currentNode.val);

                    if(currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null) { // left is added after right so that: 6, 7 and not 7, 6
                        queue.addFirst(currentNode.left);
                    }
                }

            }
            reverse = !reverse; // flip after loop
            result.add(currentLevel);
        }

        return result;
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
