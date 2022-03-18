package com.interview.datastructure.tree;

import java.util.*;

/**
 * Created by tara on 1/26/17.
 */
class BinarySearchTree {

    Node root = null;

    class Node {

        Node left, right;
        int key;

        public Node( int item )
        {
            left = right = null;
            key = item;
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

    Node searchKey( int key )
    {
        return search(root, key);
    }

    Node search( Node root, int key )
    {

        if( root == null || root.key == key )
            return root;
        if( root.key > key )
        {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    //max Height or depth of a binary tree is number of edges from given node to the farthest leaf node
    int height( Node root )
    {
        if( root == null )
            return -1;

        return (1 + Math.max(height(root.left), height(root.right)));
    }

    //Depth of a tree -- Number of edges from root to the given node
    int size( Node root )
    {
        if( root == null )
            return 0;

        return (1 + Math.max(size(root.left), size(root.right)));
    }

    int getLeafCount( Node node )
    {
        if( node == null )
            return 0;
        if( node.left == null && node.right == null )
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }

    int getHeightWithoutRec(Node root){
        Queue<Node> queue = new LinkedList();

        Node current = root;
        int height = -1;
        int nodeCount = 0;
        queue.add(current);

        while(!queue.isEmpty()){

            nodeCount = queue.size();

            while (nodeCount > 0){
                Node node = queue.poll();

                if(node.left != null)
                    queue.offer(node.left);

                if(node.right != null)
                    queue.offer(node.right);

                nodeCount--;
            }
            height++;

        }
        return height;
    }
}
