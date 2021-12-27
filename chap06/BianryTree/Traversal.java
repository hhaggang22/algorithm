package chap06.BianryTree;

import chap06.BianryTree.BinarySearchTree.Node;;

public class Traversal {

    // 전위순회
    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(" " + node.getValue());
        preorder(node.getLeftChild());
        preorder(node.getRightChild());
    }

    // 중위순회
    public void inorder(Node node) {
        if (node == null) {
            return;
        }

        preorder(node.getLeftChild());
        System.out.println(" " + node.getValue());
        preorder(node.getRightChild());
    }

    // 후위순회
    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        preorder(node.getLeftChild());
        preorder(node.getRightChild());
        System.out.println(" " + node.getValue());
    }

}
