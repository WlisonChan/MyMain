/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }

        if(root1.val==root2.val){
            if(preOrderTree(root1, root2))return true;
        }
        boolean b = HasSubtree(root1.left,root2);
        boolean b2 =HasSubtree(root1.right,root2);
        return b&&b2;
    }

    public boolean preOrderTree(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }else if(root1 == null || root2 == null){
            return false;
        }
        boolean b1 = preOrderTree(root1.left, root2.left);
        boolean b2 = preOrderTree(root1.right, root2.right);
        if(root1.val == root2.val){
            return true;
        }
        return b1 && b2;
    }
}
