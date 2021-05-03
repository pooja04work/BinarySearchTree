package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void binarySearchTreeSize3() {
        BinaryTree<Integer> BinaryTree = new BinaryTree();
        BinaryTree.add(56);
        BinaryTree.add(30);
        BinaryTree.add(70);
        int size = BinaryTree.size;
        Assert.assertEquals(3,size);
    }

    @Test
    public void binarySearchTreeSize() {
        BinaryTree<Integer> BinaryTree = new BinaryTree();
        BinaryTree.add(56);
        BinaryTree.add(30);
        BinaryTree.add(70);
        BinaryTree.add(22);
        BinaryTree.add(40);
        BinaryTree.add(11);
        BinaryTree.add(3);
        BinaryTree.add(16);
        BinaryTree.add(60);
        BinaryTree.add(65);
        BinaryTree.add(63);
        BinaryTree.add(67);
        BinaryTree.add(50);
        int size = BinaryTree.size;
        Assert.assertEquals(13,size);
    }
}
