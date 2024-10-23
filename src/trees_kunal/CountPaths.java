package trees_kunal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CountPaths {

    int countPaths(TreeNode node, int sum) {
        List<Integer> path = new ArrayList<>();

        return helper(node, sum, path);
    }

    int helper (TreeNode node, int givenSum, List<Integer> path) {
        if (node == null) {
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int sum = 0;

        // calculate possible paths
        ListIterator<Integer> itr = path.listIterator(path.size());
        while(itr.hasPrevious()) {
            sum += itr.previous();

            if (sum == givenSum) {
                count++;
            }
        }

        count += helper(node.left, sum, path) + helper(node.right, sum, path);

        // backtrack before count
        path.remove(path.size() - 1);

        return count;
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
