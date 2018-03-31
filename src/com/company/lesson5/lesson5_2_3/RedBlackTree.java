package com.company.lesson5.lesson5_2_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RedBlackTree {

    private class Node {
        private Node left;
        private Node right;
        private Node parent;
        private RedBlackEnum color;
        private int data;

        public Node() {
            this.data = 0;
            this.color = RedBlackEnum.NONE;
            this.parent = null;
            this.left = null;
            this.right = null;
        }

        public Node(int data, RedBlackEnum color){
            parent=nil;
            left=nil;
            right=nil;
            this.data = data;
            this.color=color;
        }

        public Node(Node node){
            this.left = node.getLeft();
            this.right = node.getRight();
            this.parent = node.getParent();
            this.color = node.getColor();
            this.data = node.getData();
        }

        public boolean isFree(){
            return this==null||this==nil;
        }
        public boolean isLeftFree(){
            return left==null||left==nil;
        }
        public boolean isRightFree(){
            return right==null||right==nil;
        }
        public boolean isParentFree(){
            return parent==null||parent==nil;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
            if(this.left!=null&&this.left!=nil){
                this.left.parent=this;
            }
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
            if(this.right!=null&&this.right!=nil){
                this.right.parent=this;
            }
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public RedBlackEnum getColor() {
            return color;
        }

        public void setColor(RedBlackEnum color) {
            this.color = color;
        }

        public boolean isBlack(){
            return color==RedBlackEnum.BLACK;
        }

        public boolean isRed(){
            return color==RedBlackEnum.RED;
        }

        public void makeRed(){
            color = RedBlackEnum.RED;
        }

        public void makeBlack(){
            color = RedBlackEnum.BLACK;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getGrandfather(){
            if(parent!=null&&parent!=nil){
                return parent.parent;
            }
            return null;
        }

        public Node getUncle(){
            Node grandF = getGrandfather();
            if(grandF!=null){
                if(grandF.left==parent){
                    return grandF.right;
                }else if(grandF.right==parent){
                    return grandF.left;
                }
            }
            return null;
        }

        public Node getNextNode(){
            Node temp = null;
            Node node = this;
            if(!node.isRightFree()){
                temp=node.getRight();
                while (!temp.isLeftFree()){
                    temp=temp.getLeft();
                }
                return temp;
            }
            temp = node.getParent();
            while (temp!=nil&&node==temp.getRight()){
                node=temp;
                temp=temp.getParent();
            }
            return temp;
        }
        public String getColorName(){
            return ((isBlack())? "B":"R");
        }
    }

    private Node root;
    private Node nil;
    private Node current;
    private boolean isRemoved;

    public RedBlackTree() {
        root=new Node();
        nil=new Node();
        nil.color = RedBlackEnum.BLACK;
        root.parent=nil;
        root.left=nil;
        root.right=nil;
        isRemoved = false;
    }

    private static void leftRotate(RedBlackTree tree,Node node){
        Node nodParent = node.getParent();
        Node nodRight = node.getRight();
        if(nodParent != tree.nil) {
            if(nodParent.getLeft() == node)
                nodParent.setLeft(nodRight);
            else
                nodParent.setRight(nodRight);
        }
        else {
            tree.root = nodRight;
            tree.root.setParent(tree.nil);
        }
        node.setRight(nodRight.getLeft());
        nodRight.setLeft(node);
    }

    private static void rightRotate(RedBlackTree tree,Node node){
        Node nodParent = node.getParent();
        Node nodLeft = node.getLeft();
        if(nodParent != tree.nil) {
            if(nodParent.getLeft() == node)
                nodParent.setLeft(nodLeft);
            else
                nodParent.setRight(nodLeft);
        }
        else {
            tree.root = nodLeft;
            tree.root.setParent(tree.nil);
        }
        node.setLeft(nodLeft.getRight());
        nodLeft.setRight(node);
    }

    public void printTree(RedBlackTree tree){
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(0,tree.root);
        printNodes(tree,nodes);
    }

    private void printNodes(RedBlackTree tree, ArrayList<Node> nodes){
        int childsCounter = 0;
        int nodesAmount = nodes.size();
        ArrayList<Node> childs = new ArrayList<>();

        for(int i = 0; i < nodesAmount; i++) {
            if(nodes.get(i) != null && nodes.get(i) != tree.nil) {
                System.out.print("(" + nodes.get(i).getData() + "," + nodes.get(i).getColorName() + ")");
                if(!nodes.get(i).isLeftFree()) {
                    childs.add(nodes.get(i).getLeft());
                    childsCounter++;
                }
                else
                    childs.add(null);
                if(!nodes.get(i).isRightFree()) {
                    childs.add(nodes.get(i).getRight());
                    childsCounter++;
                }
                else
                    childs.add(null);
            }
            else {
                System.out.print("(nil)");
            }
        }
        System.out.print("\n");

        if(childsCounter != 0)
            printNodes(tree, childs);
    }
    public void add(int o) {
        Node node = root, temp = nil;
        Node newNode = new Node(o, RedBlackEnum.RED);
        while(node != null && node != nil && !node.isFree()) {
            temp = node;
            if(newNode.getData()-node.getData() < 0)
                node = node.getLeft();
            else
                node = node.getRight();
        }
        newNode.setParent(temp);
        if(temp == nil)
            root.setData(newNode.getData());
        else {
            if(newNode.getData()-temp.getData() < 0)
                temp.setLeft(newNode);
            else
                temp.setRight(newNode);
        }
        newNode.setLeft(nil);
        newNode.setRight(nil);
        fixInsert(newNode);
    }

    private void fixInsert(Node node) {
        Node temp;
        while(!node.isParentFree() && node.getParent().isRed()) {
            if(node.getParent() == node.getGrandfather().getLeft()) {
                temp = node.getGrandfather().getRight();
                if(temp.isRed()) {
                    temp.makeBlack();
                    node.getParent().makeBlack();
                    node.getGrandfather().makeRed();
                    node = node.getGrandfather();
                }
                else {
                    if(node == node.getParent().getRight()) {
                        node = node.getParent();
                        leftRotate(this, node);
                    }
                    node.getParent().makeBlack();
                    node.getGrandfather().makeRed();
                    rightRotate(this, node.getGrandfather());
                }
            }
            else {
                temp = node.getGrandfather().getLeft();
                if(temp.isRed()) {
                    temp.makeBlack();
                    node.getParent().makeBlack();
                    node.getGrandfather().makeRed();
                    node = node.getGrandfather();
                }
                else {
                    if(node == node.getParent().getLeft()) {
                        node = node.getParent();
                        rightRotate(this, node);
                    }
                    node.getParent().makeBlack();
                    node.getGrandfather().makeRed();
                    leftRotate(this, node.getGrandfather());
                }
            }
        }
        root.makeBlack();
    }

    public boolean remove(int o) {
        return remove(findNode(o));
    }

    private boolean remove(Node node)
    {
        Node temp = nil, successor = nil;

        if(node == null || node == nil)
            return false;

        if(node.isLeftFree() || node.isRightFree())
            successor = node;
        else
            successor = node.getNextNode();

        if(!successor.isLeftFree())
            temp = successor.getLeft();
        else
            temp = successor.getRight();
        temp.setParent(successor.getParent());

        if(successor.isParentFree())
            root = temp;
        else if(successor == successor.getParent().getLeft())
            successor.getParent().setLeft(temp);
        else
            successor.getParent().setRight(temp);

        if(successor != node) {
            node.setData(successor.getData());
        }
        if(successor.isBlack())
            fixRemove(temp);
        return true;
    }
    private void fixRemove(Node node)
    {
        Node temp;
        while(node != root && node.isBlack()) {
            if(node == node.getParent().getLeft()) {
                temp = node.getParent().getRight();
                if(temp.isRed()) {
                    temp.makeBlack();
                    node.getParent().makeRed();
                    leftRotate(this, node.getParent());
                    temp = node.getParent().getRight();
                }
                if(temp.getLeft().isBlack() && temp.getRight().isBlack()) {
                    temp.makeRed();
                    node = node.getParent();
                }
                else {
                    if(temp.getRight().isBlack()) {
                        temp.getLeft().makeBlack();
                        temp.makeRed();
                        rightRotate(this, temp);
                        temp = node.getParent().getRight();
                    }
                    temp.setColor(node.getParent().getColor());
                    node.getParent().makeBlack();
                    temp.getRight().makeBlack();
                    leftRotate(this, node.getParent());
                    node = root;
                }
            }
            else {
                temp = node.getParent().getLeft();
                if(temp.isRed()) {
                    temp.makeBlack();
                    node.getParent().makeRed();
                    rightRotate(this, node.getParent());
                    temp = node.getParent().getLeft();
                }
                if(temp.getLeft().isBlack() && temp.getRight().isBlack()) {
                    temp.makeRed();
                    node = node.getParent();
                }
                else {
                    if(temp.getLeft().isBlack()) {
                        temp.getRight().makeBlack();
                        temp.makeRed();
                        leftRotate(this, temp);
                        temp = node.getParent().getLeft();
                    }
                    temp.setColor(node.getParent().getColor());
                    node.getParent().makeBlack();
                    temp.getLeft().makeBlack();
                    rightRotate(this, node.getParent());
                    node = root;
                }
            }
        }
        node.makeBlack();
    }
    private Node findNode(int o) {
        Node node = root;
        while(node != null && node != nil && node.getData()-o != 0) {
            if(node.getData()-o > 0)
                node = node.getLeft();
            else
                node = node.getRight();
        }
        return node;
    }
}
