package com.interview.datastructure.BST;

import java.util.LinkedList;

public class NextRightPointer {

    public class TreeLinkNode {

        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode( int x )
        {
            val = x;
        }

    }

    //Maintain 2 Queues 1 Queue which holds the elements in priority from level 1 and other queue will hold the depth associated to each node in nodequeue

    public void connect( TreeLinkNode root )
    {
        if( root == null )
            return;

        LinkedList<TreeLinkNode> nodeQueue = new LinkedList<TreeLinkNode>();
        LinkedList<Integer> depthQueue = new LinkedList<Integer>();

        if( root != null )
        {
            nodeQueue.offer(root);
            depthQueue.offer(1);
        }

        while( !nodeQueue.isEmpty() )
        {
            TreeLinkNode topNode = nodeQueue.poll();
            int depth = depthQueue.poll();

            if( depthQueue.isEmpty() )
            {
                topNode.next = null;
            }
            else if( depthQueue.peek() > depth )
            {
                topNode.next = null;
            }
            else
            {
                topNode.next = nodeQueue.peek();
            }

            if( topNode.left != null )
            {
                nodeQueue.offer(topNode.left);
                depthQueue.offer(depth + 1);
            }

            if( topNode.right != null )
            {
                nodeQueue.offer(topNode.right);
                depthQueue.offer(depth + 1);
            }
        }
    }
}
