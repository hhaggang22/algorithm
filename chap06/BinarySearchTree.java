package chap06;

public class BinarySearchTree {
    private Node root;

    // 루트 세팅
    public void setRoot(Node node) {
        this.root = node;
    }

    // 루트 가져오기
    public Node getRoot() {
        return this.root;
    }

    // Node 내부 class
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

        public int getValue() {
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

    // 재귀 함수를 통한 이진탐색트리 검색
    public Node search(Node node, int value) {
        if (node == null) {
            return null;
        } else if (node.getValue() == value) {
            return node;
        } else if (node.getValue() > value) {
            return search(node.getLeftChild(), value);
        } else {
            return search(node.getRightChild(), value);
        }
    }

    // 반복문을 통한 이진탐색트리 검색
    public Node search(int value) {
        if (this.root == null) {
            return null;
        }

        Node target = this.root;
        while (target != null && target.getValue() != value) {
            if (target.getValue() > value) {
                target = target.getLeftChild();
            } else {
                target = target.getRightChild();
            }
        }
        return target;
    }

    // 너비우선탐색
    public void bfs(Node root) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueu(root);

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
