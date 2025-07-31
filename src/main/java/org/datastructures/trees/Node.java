package org.datastructures.trees;

import java.security.PublicKey;

public class Node {

    public int data;
    public Node right;
    public Node left;

    public Node (int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public void insert(int value) {
        if (data <= value) {
            if (left == null) {
                left = new Node(value);
            }
            else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
            }
        System.out.println(data);

        if (right != null) {
            right.printInOrder();
        }
    }
    public void remove(Node node) {

    }


    public boolean containsValue(int value) {

        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.containsValue(value);
            }
        } else  {
            if (right == null) {
                return false;
            } else {
                return right.containsValue(value);
            }
        }

    }

    public static void main(String[] args) {

        Node node = new Node(4);

        node.insert(9);
        node.insert(2);
        node.insert(1);
        node.insert(5);
        node.insert(3);
        node.insert(8);

        node.printInOrder();

    }

}


