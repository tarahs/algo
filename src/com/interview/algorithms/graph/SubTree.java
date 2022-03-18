package com.interview.algorithms.graph;

public class SubTree {

    static class Node{
        char data;
        Node left, right;

        public Node(char data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        Node T = new Node('a');
        T.left = new Node('b');
        T.right = new Node('d');
        T.left.left = new Node('c');
        T.right.right = new Node('e');

        Node S = new Node('a');
        S.left = new Node('b');
        S.right = new Node('d');
        S.left.left = new Node('c');
        S.right.right = new Node('e');
        S.right.left = new Node('h');

        int t1 = count(T);


        if(count(T) > count(S))
            System.out.println(isSubtree1(T, S));
        else
            System.out.println(isSubtree1(S,T));
    }


    public static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null)
            return true;

        if(root1 == null || root2 ==null)
            return false;

        return (root1.data == root2.data && (isIdentical(root1.left, root2.left) || isIdentical(root1.right, root2.right)));
    }

    public static boolean isSubTree(Node tree, Node subTree){

        if(subTree == null)
            return true;

        if(tree == null)
            return false;

        if(isIdentical(tree, subTree))
            return true;

        return isSubTree(tree.left, subTree) || isSubTree(tree.right, subTree);

    }


    public static int count(Node root){
        if(root == null)
            return 0;

        return 1+count(root.left)+count(root.right);
    }

    public static boolean isSubtree1 (Node t1, Node t2)
    {
        if (t2 == null) // An empty subtree can always be found in any tree
            return true;

        if (t1 == null) // If no more tree is left to search, return false
            return false;

        // If there is a match, check the left and right nodes to match with
        // left and right subtrees
        if (t1.data == t2.data)
            return isSubtree1(t1.left, t2.left) && isSubtree1(t1.right, t2.right);

        // If there is no match, check left and right subtrees for a
        // match with current tree
        return isSubtree1(t1.left, t2) || isSubtree1(t1.right, t2);
    }

}






