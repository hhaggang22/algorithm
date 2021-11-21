package chap06;

public class BinaryTree {
    private Node root;

    public class Node {
        private int value;
        private Node left = null;
        private Node right = null;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Object getValue() {
            return this.value;
        }
    }

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
    }

    public void bfs(Node root) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(root);

        while (!queue.empty()) {
            Node node = (Node) queue.dequeue();
            System.out.println(node.getValue() + " ");

            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }

            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }
    }
}