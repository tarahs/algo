package com.interview.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSDFS {

    Node root;

    class Node {

        int data;
        Node left,right;
    }

    public static void breadFirstSearch( Node root )
    {
        if( root == null )
            return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while( !queue.isEmpty() )
        {
            Node node = queue.poll();
            System.out.println(node.data);

            if( node.left != null )
                queue.add(node.left);

            if( node.right != null )
                queue.add(node.right);
        }

    }

    public static void depthFirstSearch( Node root )
    {
        /**
         * SAME AS PREORDER, INORDER AND POSTORDER
         */
    }

}
