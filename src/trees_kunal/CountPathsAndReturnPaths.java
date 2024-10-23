package trees_kunal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CountPathsAndReturnPaths {

    List<List<Integer>> countPathsAndReturn(TreeNode node, int sum) {
        List<List<Integer>> paths = new ArrayList<>(); // all paths
        List<Integer> path = new ArrayList<>(); // current path

        helper(node, sum, path, paths);
        return paths;
    }

    void helper (TreeNode node, int givenSum, List<Integer> path, List<List<Integer>> paths) {
        if (node == null) {
            return;
        }

        path.add(node.val);

        if (node.val == givenSum && node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            helper (node.left, givenSum - node.val, path, paths);
            helper (node.right, givenSum - node.val, path, paths);
        }

        // backtrack before count
        paths.remove(path.size() - 1);
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
