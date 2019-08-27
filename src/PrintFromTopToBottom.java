import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。(层次遍历二叉树)
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> al = new ArrayList<>();
        if(root==null)return al;
        queue.offer(root);
        while (queue.size()!=0){
            TreeNode poll = queue.poll();
            al.add(poll.val);
            if(poll.left!=null){
                queue.offer(poll.left);
            }
            if(poll.right!=null){
                queue.offer(poll.right);
            }
        }
        return al;
    }
}
