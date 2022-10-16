public class MainBinaryTree {
    public static void main(String[] args){

        /*   Constructed Binary tree is:
                 1              = 1
               /   \
             2      3           = 5
           /  \   /  \
          4    5 6    7         = 22
         /     \
        8       9               = 17        */

        SumLevelsBinaryTree.Node root = new SumLevelsBinaryTree.Node(1);
        root.left = new SumLevelsBinaryTree.Node(2);
        root.right = new SumLevelsBinaryTree.Node(3);
        root.left.left = new SumLevelsBinaryTree.Node(4);
        root.left.right = new SumLevelsBinaryTree.Node(5);
        root.right.right = new SumLevelsBinaryTree.Node(7);
        root.right.left = new SumLevelsBinaryTree.Node(6);
        root.left.left.left = new SumLevelsBinaryTree.Node(8);
        root.left.left.right = new SumLevelsBinaryTree.Node(9);
        System.out.println(SumLevelsBinaryTree.SumLevels(root));

         /*   Constructed Binary tree is:
                 1              = 1     
               /   \
              2      3          = 5
            /  \      \
           4    5      8        = 17
                     /   \
                    6     7     = 13         */

        SumLevelsBinaryTree.Node root1 = new SumLevelsBinaryTree.Node(1);
        root1.left = new SumLevelsBinaryTree.Node(2);
        root1.right = new SumLevelsBinaryTree.Node(3);
        root1.left.left = new SumLevelsBinaryTree.Node(4);
        root1.left.right = new SumLevelsBinaryTree.Node(5);
        root1.right.right = new SumLevelsBinaryTree.Node(8);
        root1.right.right.left = new SumLevelsBinaryTree.Node(6);
        root1.right.right.right = new SumLevelsBinaryTree.Node(7);
        System.out.println(SumLevelsBinaryTree.SumLevels(root1));

         /*   Constructed Binary tree is:
                 6              = 6
               /   \
              4     8           = 12
            /  \   /  \
           3    5 7    9         = 24       */

        SumLevelsBinaryTree.Node root2 = new SumLevelsBinaryTree.Node(6);
        root2.left = new SumLevelsBinaryTree.Node(4);
        root2.right = new SumLevelsBinaryTree.Node(8);
        root2.left.left = new SumLevelsBinaryTree.Node(3);
        root2.left.right = new SumLevelsBinaryTree.Node(5);
        root2.right.left = new SumLevelsBinaryTree.Node(7);
        root2.right.right = new SumLevelsBinaryTree.Node(9);
        System.out.println(SumLevelsBinaryTree.SumLevels(root2));

        /*   Constructed Binary tree is:
                 1              = 1
               /   \
              2     3           = 5
            /  \   /  \
           4    5 6    7         = 22       */
        SumLevelsBinaryTree.Node root3 = new SumLevelsBinaryTree.Node(1);
        root3.left = new SumLevelsBinaryTree.Node(2);
        root3.right = new SumLevelsBinaryTree.Node(3);
        root3.left.left = new SumLevelsBinaryTree.Node(4);
        root3.left.right = new SumLevelsBinaryTree.Node(5);
        root3.right.left = new SumLevelsBinaryTree.Node(6);
        root3.right.right = new SumLevelsBinaryTree.Node(7);
        System.out.println(SumLevelsBinaryTree.SumLevels(root3));

        /*   Constructed Binary tree is:
                 6              = 6
               /   \
              4     8           = 12
            /        \
           3          9         = 12       */
        SumLevelsBinaryTree.Node root4 = new SumLevelsBinaryTree.Node(6);
        root4.left = new SumLevelsBinaryTree.Node(4);
        root4.right = new SumLevelsBinaryTree.Node(8);
        root4.left.left = new SumLevelsBinaryTree.Node(3);
        root4.right.right = new SumLevelsBinaryTree.Node(9);
        System.out.println(SumLevelsBinaryTree.SumLevels(root4));
    }

}
