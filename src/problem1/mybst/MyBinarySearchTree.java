/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree

public class MyBinarySearchTree {

    TreeNode root;
    int count;

    public MyBinarySearchTree() {
        root = null;
        count = 0;
    }

    public void insert(int data) {
        TreeNode ns = new TreeNode();
        ns.setdata(data);
        if (root == null) {
            root = ns;

        } else {
            TreeNode current = root;
            while (true) {

                if (data > current.getdata()) {
                    if (current.getRight() == null) {
                        current.setRight(ns);
                        break;
                    } else {
                        current = current.getRight();
                    }

                } else {

                }
            }
        }
    }
}
