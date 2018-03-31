package com.company.lesson5.lesson5_2_3;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        for(int i=0;i<10;i++){
            tree.add((int)(Math.random()*5+1));
        }
        tree.printTree(tree);

        tree.remove(5);
        tree.printTree(tree);
    }
}
