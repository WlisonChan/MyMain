import java.util.ArrayList;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */

public class FindPath {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        allPath(root,target,new ArrayList<>());
        return res;
    }

    public void allPath(TreeNode root,int target,ArrayList<Integer> current){
        if(root==null){
            return;
        }
        ArrayList<Integer> al = new ArrayList<>(current);
        al.add(root.val);
        allPath(root.left,target-root.val,al);
        allPath(root.right,target-root.val,al);
        if(target==root.val && root.left==null && root.right ==null){
            res.add(al);
        }
    }
}
