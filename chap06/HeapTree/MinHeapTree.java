package chap06.HeapTree;

public class MinHeapTree {
    private int[] heap;
    private int size;
    private int pointer;

    MinHeapTree(int size) {
        this.size = size;
        this.heap = new int[size + 1];
        this.heap[0] = -1;
        this.pointer = 0;
    }

    public int getRoot() {
        return heap[1];
    }

    public int getParentIndex(int index) {
        if (index < 1) {
            return -1;
        }
        return index / 2;
    }

    public int getLeftChildIndex(int index) {
        if (index < 1) {
            return -1;
        }
        return 2 * index;
    }

    public int getRightChildIndex(int index) {
        if (index < 1) {
            return -1;
        }
        return (2 * index) + 1;
    }

    public boolean isLeafNode(int index) {
        return getLeftChildIndex(index) > size && getRightChildIndex(index) > size;
    }

    public void swap(int currentIndex, int parentIndex) {
        int temp;
        temp = heap[currentIndex];
        heap[currentIndex] = heap[parentIndex];
        heap[parentIndex] = temp;
    }

    public void printAll() {
        for (int i = 1; i <= size; i++) {
            int parent = heap[i];
            int leftChild = 2 * i <= size ? heap[2 * i] : -1;
            int rightChild = (2 * i) + 1 <= size ? heap[(2 * i) + 1] : -1;

            if (leftChild > -1 && rightChild > -1) {
                System.out.println(String.format("부모: %s, 왼쪽자식: %s, 오른쪽자식 : %s", parent, leftChild, rightChild));
            } else if (leftChild > -1 && rightChild == -1) {
                System.out.println(String.format("부모: %s, 왼쪽자식: %s, 오른쪽자식은 없습니다.", parent, leftChild));
            } else if (rightChild > -1 && leftChild == -1) {
                System.out.println(String.format("부모: %s, 오른쪽자식: %s, 왼쪽자식은 없습니다.", parent, rightChild));
            } else {
                System.out.println(String.format("This is LeafNode, 부모: %s", parent));
            }
        }
    }

    // 최소힙트리 삽입
    /*
     * 1. 힙 배열의 맨 마지막 위치에 value를 넣는다. 2. 부모 노드의 값과 비교한다. 3. insert할 value가 부모 노드보다
     * 작으면 부모 노드와 값을 바꾼다.(swap)
     */
    public void insert(int value) { // 내가 생각한 코드
        heap[++pointer] = value;
        int currentIndex = pointer;

        if (heap[currentIndex] < heap[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
        }
    }

    // 답안코드 => 내코드와 왜 다를까??
    // while문을 쓰지 않으면 노드의 개수가 4개까지는 괜찮지만, 5개 이상 이후 노드가 더 작은 노드가 들어오면 swap을 하지를 못한다.
    // 그니까 pointer가 6일 때 currentIndex가 3으로 바뀌는데,
    // 만약 while문을 안쓰면 head[3] 과 heap[1]을 비교할 수 없어서 가장 작은 노드인 3이 맨 앞으로 가지 못한다!!
    // 계속 자신의 부모노드와 비교하면서 가장 작은 것을 앞으로 보내야하기 때문에 while문이 필요하다.

    public void insertAnswer(int value) {
        heap[++pointer] = value;
        int currentIndex = pointer;

        while (heap[currentIndex] < heap[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }
    }

}
