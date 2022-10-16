import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class SumLevelsBinaryTree {

    static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> SumLevels(Node root){
        List<Integer> SumEachLevel = new ArrayList<Integer>();
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            int size = nodes.size();
            int sumLevel = 0;

            while(size-- > 0){
                Node each = nodes.poll();
                sumLevel += each.value;

                if(each.left != null) {
                    nodes.add(each.left);
                }

                if(each.right != null){
                    nodes.add(each.right);
                }
            }
            SumEachLevel.add(sumLevel);
        }
        return SumEachLevel;
    }

}
