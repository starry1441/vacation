package work1_31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -01 -31
 * Time: 23:24
 */
public class Work4 {
    public int widthOfBinaryTree(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            while(size > 0) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(list);
        }
        int max = ret.get(0).size();
        for(int i=1;i<ret.size();i++) {
            if(max < ret.get(i).size()) {
                max = ret.get(i).size();
            }
        }
        return max;
    }
}
