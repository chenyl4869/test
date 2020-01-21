package leetcode_51_100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tools.TreeNode;

public class N95_UniqueBinarySearchTreeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    public List<TreeNode> helper(int min, int max){
        List<TreeNode> res = new ArrayList<>();
        if(min > max){
            return res;
        }
        for(int i = min; i <= max; i++){
            
            List<TreeNode> leftList = helper(min, i-1);
            List<TreeNode> rightList = helper(i+1, max);
            if(leftList.size() == 0 && rightList.size() == 0){
                TreeNode node = new TreeNode(i);
                res.add(node);
            }else if(leftList.size() == 0 && rightList.size() != 0){
                for(TreeNode rightNode: rightList){
                    TreeNode node = new TreeNode(i);
                    node.right = rightNode;
                    res.add(node);
                }
            }else if(leftList.size() != 0 && rightList.size() == 0){
                for(TreeNode leftNode : leftList){
                    TreeNode node = new TreeNode(i);
                    node.left = leftNode;
                    res.add(node);
                }
            }else{
                for(TreeNode leftNode : leftList){
                    for(TreeNode rightNode : rightList){
                        TreeNode node = new TreeNode(i);
                        node.left = leftNode;
                        node.right = rightNode;
                        res.add(node);
                    }
                }
            }
        }
        return res;
    }

}
