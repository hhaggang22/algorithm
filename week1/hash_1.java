package week1;

import java.util.Arrays;
import java.util.HashMap;

public class hash_1 {
    static String participant[] = { "leo", "kiki", "eden" };
    static String completion[] = { "eden", "kiki" };

    public static void main(String[] args) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        String result = solution(participant, completion);

        System.out.println(result);

    }

    public static String solution(String[] arr1, String[] arr2) {
        String norun = "";

        HashMap<String, String> part = new HashMap<>();
        HashMap<String, String> com = new HashMap<>();

        // hashmap 에 배열 저장
        for (int i = 0; i < arr1.length; i++) {
            part.put("p" + i, arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            com.put("c" + i, arr2[i]);
        }

        int n = 0;
        while (n < com.size()) {
            if (!com.get("c" + n).equals(part.get("p" + n))) {
                norun = part.get("p" + n);
                break;
            } else {
                n++;
            }
        }

        /*
         * for (int k = 0; k < part.size(); k++) { if (!part.get("p" +
         * k).equals(com.get("c" + k))) { norun = part.get("p" + k); } }
         */

        return norun;
    }
}
