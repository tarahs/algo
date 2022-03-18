package com.interview.datastructure.BST;

/**
 *
 * 000111110
 *
 * 01
 * 0011
 * 000111
 *10
 *
 */

/**
 * The left subtree of a node contains only nodes with keys less than the node’s key. The right
 * subtree of a node contains only nodes with keys greater than the node’s key. The left and right
 * subtree each must also be a binary search tree.
 * 
 * 
 * operations like search, minimum and maximum can be done fast
 */

public class BST {

    Node root = null;

    class Node {

        int key;
        Node left = null;
        Node right = null;

        Node( int data )
        {
            this.key = data;
        }

    }

    public void insertKey( int key )
    {
        root = insertRecord(root, key);
    }

    Node insertRecord( Node root, int key )
    {
        if( root == null )
        {
            root = new Node(key);
            return root;
        }

        if( key < root.key )
            root.left = insertRecord(root.left, key);

        if( key > root.key )
            root.right = insertRecord(root.right, key);

        return root;
    }

    Boolean isBST()
    {
        return isBinaryUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    Boolean isBinaryUtil( Node root, int min, int max )
    {
        if( root == null )
            return true;

        if( root.key < min || root.key > max )
            return false;

        return (isBinaryUtil(root.left, min, (root.key - 1)) && isBinaryUtil(root.right, (root.key + 1), max));
    }

    Node serachKey( Node root, int key )
    {
        if( root == null || root.key == key )
            return root;

        if( root.key < key )
            return serachKey(root.right, key);
        else
            return serachKey(root.left, key);

    }

}
