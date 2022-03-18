package com.interview.datastructure.tree;

import java.util.ArrayList;

public class Main {

    public static void main( String[] args )
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertKey(8);
        bst.insertKey(4);
        bst.insertKey(2);
        bst.insertKey(5);
        bst.insertKey(13);
        bst.insertKey(14);
        bst.insertKey(16);
        bst.insertKey(17);

        System.out.println("HEIGHT: "+bst.height(bst.root));
        System.out.println("HEIGHT2: "+bst.getHeightWithoutRec(bst.root));


    }

    static BinarySearchTree buildNonBinaryTree()
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.new Node(4);
        bst.root.left = bst.new Node(6);
        bst.root.right = bst.new Node(2);
        return bst;
    }




}
