package com.bridgelabz;
public class BinaryTree<T extends Comparable<T>> {
    public BinaryNode<T> root;
    public int size;

    public void add(T data) {
        if (isEmpty()) {
            root = new BinaryNode<T>(data);
        } else {
            add(root, data);
        }
        size++;
    }
    private boolean isEmpty() {
        return size == 0;
    }
    private void add(BinaryNode<T> node, T data) {
        if (data.compareTo(node.data) < 0) {
            if(node.left != null) {
                add(node.left, data);
            } else {
                node.left = new BinaryNode<T>(data);
                return;
            }
        } else if (data.compareTo(node.data) > 0) {
            if(node.right != null) {
                add(node.right, data);
            } else {
                node.right = new BinaryNode<T>(data);
                return;
            }
        }else {return;}
    }
}