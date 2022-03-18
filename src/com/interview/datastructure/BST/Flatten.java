package com.interview.datastructure.BST;

import java.util.Stack;
import com.interview.datastructure.BST.BST.Node;

public class Flatten {

    //Push all the right Nodes to Stack
    // link all left nodes to right node
    // and poll when there is no left node found
    public void flatten( Node root )
    {
        Stack<Node> stack = new Stack<Node>();
        Node p = root;

        while( p != null || !stack.isEmpty() )
        {
            if( p.right != null )
            {
                stack.push(p.right);
            }
            if( p.left != null )
            {
                p.right = p.left;
                p.left = null;
            }
            else if( !stack.isEmpty() )
            {
                p.right = stack.pop();
            }
            p = p.right;
        }

    }
}
