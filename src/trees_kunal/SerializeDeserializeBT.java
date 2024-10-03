package trees_kunal;

import java.util.*;

// leetcode 297
public class SerializeDeserializeBT {

    // leetcode approach
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }
    public void helper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null").append(",");
            return;
        }

        sb.append(node.val).append(",");

        helper(node.left, sb);
        helper(node.right, sb);
    }

    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(nodes)); // to form a tree
        return helper2(list);
    }
    public TreeNode helper2(List<String> list) {
        if(list.get(0).equals("null")) {
            list.remove(0);
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(list.remove(0)));

        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }


    // kunal's approach
    public List<String> serializeKunal(TreeNode root) {
        List<String> list = new ArrayList<>();
        helperKunal(root, list);
        return list;
    }
    public void helperKunal(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));

        helperKunal(node.left, list);
        helperKunal(node.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserializeKunal(List<String> list) {
        // reverse the list to remove from last and avoid reshifting
        Collections.reverse(list);

        TreeNode node = helper2Kunal(list);

        return node;
    }
    public TreeNode helper2Kunal(List<String> list) {
        String val = list.remove(list.size() - 1); // remove from last

        if (val.charAt(0) == 'n') {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper2Kunal(list);
        node.right = helper2Kunal(list);

        return node;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
