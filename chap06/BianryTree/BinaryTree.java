package chap06.BianryTree;

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

        public void setLeftChild(Node node) {
            this.left = node;
        }

        public void setRightChild(Node node) {
            this.right = node;
        }

        public Node getLeftChild() {
            return this.left;
        }

        public Node getRightChild() {
            return this.right;
        }
    }

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
    }

    public void bfs(Node root) {
        LinkedListQueue queue = new LinkedListQueue(); // 이미 구현했었던 연결리스트 큐는 포함하지 않겠다.
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