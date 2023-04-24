import java.util.*;

public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        // replace with working code
        List<String> result = new ArrayList<>();
        while(tree.left != null || tree.right != null) {
            List<Integer> leaves = new ArrayList<>();
            removeLeaves(tree, null, leaves);

            StringBuilder str = new StringBuilder();

            for(int leaf : leaves) {
                str.append(leaf).append("");
            }
            result.add(Integer.toString(tree.info));
        }

        result.add(Integer.toString(tree.info));
        return result.toArray(new String[0]);
    }

    
    //helper method
    private void removeLeaves (TreeNode tree, TreeNode parent, List<Integer> leaves) {
        if(tree == null) {
            return;
        }

        if(tree.left == null && tree.right == null) {
            leaves.add(tree.info);
            if(parent != null && parent.left == tree) {
                tree.left = null;
            }else if (parent != null && parent.right == tree) {
                tree.right = null;
            }
            return;
        }

        removeLeaves(tree.left, parent, leaves);
        removeLeaves(tree.right, parent, leaves);
        

    }
}