package chap06.BianryTree;

public class CompleteBinaryTree {
    // 완전 이진트리는 이진트리랑 다르게 인덱스로 노드를 탐색할 수 있다.
    public void printAll(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int leftNode = this.getLeftNode(arr, i);
            int rightNode = this.getRightNode(arr, i);

            if (leftNode > -1) {
                System.out.println(String.format("%d의 왼쪽 자식의 노드는 %d", arr[i], leftNode));
            }

            if (rightNode > -1) {
                System.out.println(String.format("%d의 오른쪽 자식의 노드는 %d", arr[i], rightNode));
            }
        }
    }

    private int getLeftNode(int[] arr, int index) {
        int findIndex = 2 * index; // 왼쪽 자식 노드 구하는 공식 = 2x인덱스
        if (arr.length <= findIndex) {
            return -1;
        }

        return arr[findIndex];
    }

    private int getRightNode(int[] arr, int index) {
        int findIndex = (2 * index) + 1; // 오른쪽 자식 노드 구하는 공식 = (2x인덱스) + 1
        if (arr.length <= findIndex) {
            return -1;
        }

        return arr[findIndex];
    }
}
