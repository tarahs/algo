package com.interview.datastructure.tree;

import com.interview.datastructure.tree.BinarySearchTree.Node;

import java.util.Stack;

public class Traversal {

    /* Inorder traversal gives nodes in non-decreasing order */
    static void inOrder( Node node )
    {
        if( node == null )
            return;

        inOrder(node.left);
        System.out.println(node.key);
        inOrder(node.right);
    }

    /* Preorder traversal is used to create a copy of the tree. Preorder traversal is also used to
     * get prefix expression on of an expression tree. */
    static void preOrder( Node node )
    {
        if( node == null )
            return;

        System.out.println(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }

    /* Postorder traversal is used to delete the tree. Please see the question for deletion of tree
     * for details. Postorder traversal is also useful to get the postfix expression of an
     * expression tree */
    void postOrder( Node node )
    {
        if( node == null )
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key);
    }


    public void inorderNonRec(Node node){
        Stack<Node> stack = new Stack();
        Node cur = node;

        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            System.out.println(cur.key);
            cur = cur.right;
        }

    }

    public void preOrderNonRec(Node node){
        Stack<Node> stack = new Stack();
        Node cur = node;

        while(cur != null || !stack.isEmpty()){
            if(cur == null)
                cur = stack.pop();

            System.out.println(cur.key);

            if(cur.right != null){
                stack.push(cur.right);
            }
            cur = cur.left;
        }

    }

}
