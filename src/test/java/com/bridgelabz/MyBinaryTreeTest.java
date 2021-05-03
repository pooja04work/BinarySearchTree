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
}
