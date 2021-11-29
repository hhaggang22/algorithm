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

    // 이진탐색트리 삭제
    public void insert(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            return;
        }

        Node target = this.root;
        Node parent = null;

        while (target != null) {
            parent = target;

            if (target.getValue() == value) {
                System.out.println(String.format("%s는 중복된 값입니다.", value));
                break;
            }

            if (target.getValue() > value) { // 삽입하려는 값이 root보다 작은 경우 => 왼쪽으로 가야함
                target = target.getLeftChild();

                if (target == null) { // 마지막 leaf 노드까지 왔을 때
                    parent.setLeftChild(new Node(value));
                }
            } else { // 삽입하려는 값이 root보다 큰 경우 => 오른쪽으로 가야함
                target = target.getRightChild();

                if (target == null) {
                    parent.setRightChild(new Node(value));
                }
            }
        }
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
