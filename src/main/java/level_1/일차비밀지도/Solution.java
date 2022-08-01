package level_1.일차비밀지도;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        List<String> map_A = new ArrayList<>(n),
                map_B = new ArrayList<>(n);
        for (int code : arr1) map_A.add(getMap(code, n));
        for (int code : arr2) map_B.add(getMap(code, n));

        String a, b;
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = "";
            a = map_A.get(i);
            b = map_B.get(i);
            for (int j = 0; j < n; j++)
                if (a.charAt(j) == '#' || b.charAt(j) == '#') answer[i] += "#";
                else answer[i] += " ";
        }
        return answer;
    }

    public String getMap(int code, int len) {
        String map = Integer.toBinaryString(code)
                .replace("0", " ").replace("1", "#");
        while (map.length() < len) map = " " + map;
        return map;
    }
}