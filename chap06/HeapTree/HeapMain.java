package chap06.HeapTree;

public class HeapMain {

    public static void main(String[] args){
        MinHeapTree minHeapTree = new MinHeapTree(6);

        minHeapTree.insert(14);
        minHeapTree.insert(11);
        minHeapTree.insert(6);
        minHeapTree.insert(12);
        minHeapTree.insert(5);
        minHeapTree.insert(3);

        minHeapTree.printAll();
    }
    
}
