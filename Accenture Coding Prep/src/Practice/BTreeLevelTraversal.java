//import java.util.ArrayList;
//import java.util.List;
//import java.util.Queue;
//
//
//public class BTreeLevelTraversal
//{
//    public class TreeNode
//    {
//        int val;
//        TreeNode left;
//
//        TreeNode right;
//
//        TreeNode() {}
//
//        TreeNode(int val) { this.val = val; }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    public List<List<Integer>> levelOrder(TreeNode root)
//    {
//        List<List<Integer>> result = new ArrayList<>();
//
//        if(root==null)
//            return result;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty())
//        {
//            int levelSize = queue.size();
//            List<Integer> list = new ArrayList<>();
//            for(int i=0;i<levelSize;i++)
//            {
//                TreeNode element = queue.poll();
//                list.add(element.val);
//                if(element.left!=null)
//                    queue.offer(element.left);
//                if(element.right!=null)
//                    queue.offer(element.right);
//            }
//            result.add(list);
//        }
//        return result;
//    }
//}
