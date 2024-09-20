package trees_kunal;

// leetcode 108
public class ConvertSortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return null;
        }

        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, 0, mid - 1);
        root.right = helper(nums, mid + 1, end);

        return root;
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
