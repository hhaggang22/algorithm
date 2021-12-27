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

}
