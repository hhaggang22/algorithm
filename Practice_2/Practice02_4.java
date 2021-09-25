package Practice_2;

public class Practice02_4 {
    public static void main(String[] args) {
        // idea : 만약 arr에 있는 값이 result에 없으면 result에 추가한다.
        int[] arr = { 5, 10, 9, 27, 2, 8, 10, 4, 27, 1 };
        int[] result = new int[10];

        boolean isSame = false;

        result[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            for (int k = 0; k < result.length; k++) {
                if (arr[i] == result[k]) {
                    result[i] = 0; // 만약 arr에서 result 배열로 넣으려는 값이 result에 이미 존재하면 0 넣음
                    isSame = true; // 만약 이미 result안에 같은 값이 존재하면 플래그를 true
                }
            }
            if (!isSame) {
                result[i] = arr[i]; // 만약 arr에서 result 배열로 넣으려는 값이 result에 존재하지 않으면 넣음
            }
            isSame = false; // 다시 플래그 false 로 초기화
        }

        // 결과
        System.out.println("arr is");
        for (int num : arr) {
            System.out.print(num + ", ");
        }

        System.out.println("\nresult is");
        for (int data : result) {
            System.out.print(data + ", ");
        }
    }

}
