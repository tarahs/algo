package com.interview.algorithms.graph;

import java.util.ArrayList;
import java.util.List;

public class SubTreeOptimized {

    static class Node{
        char data;
        Node left, right;

        public Node(char data){
            this.data = data;
        }
    }

    public static boolean isSubTree(SubTree.Node T, SubTree.Node S){

        List<Character> TInorder = new ArrayList<>();
        inorder(TInorder, T);

        List<Character> Tpreorder = new ArrayList<>();
        preOrder(Tpreorder, T);

        List<Character> SInorder = new ArrayList<>();
        inorder(SInorder, S);

        List<Character> Spreorder = new ArrayList<>();
        preOrder(Spreorder, T);

        return (TInorder.toString().contains(SInorder.toString()) && Tpreorder.toString().contains(Spreorder.toString()));

    }



    public static void inorder(List<Character> list, SubTree.Node root){
        if(root == null)
            return;
        inorder(list, root.left);
        list.add(root.data);
        inorder(list, root.right);
    }

    public static void preOrder(List<Character> list, SubTree.Node root){
        if(root == null)
            return;
        list.add(root.data);
        inorder(list, root.left);
        inorder(list, root.right);
    }

    public static void main(String[] args){
        SubTree.Node T = new SubTree.Node('a');
        T.left = new SubTree.Node('b');
        T.right = new SubTree.Node('d');
        T.left.left = new SubTree.Node('c');
        T.right.right = new SubTree.Node('e');

        SubTree.Node S = new SubTree.Node('a');
        S.left = new SubTree.Node('b');
        S.right = new SubTree.Node('d');
        S.left.left = new SubTree.Node('c');
        S.right.right = new SubTree.Node('e');
        S.right.left = new SubTree.Node('h');

        if(count(T) > count(S))
            System.out.println(isSubTree(T, S));
        else
            System.out.println(isSubTree(S,T));
    }

    public static int count(SubTree.Node root){
        if(root == null)
            return 0;

        return 1+count(root.left)+count(root.right);
    }
}






