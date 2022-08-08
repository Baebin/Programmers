package level_1.K번째수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int index = 0, i, j;
        List<Integer> list = new ArrayList<>();
        for (i = 0; i < commands.length; i++) {
            list.clear();

            // i, j, k: commands[i][0~2]
            for (j = commands[i][0]; j <= commands[i][1]; j++)
                list.add(array[j-1]);
            Collections.sort(list);
            answer[index++] = list.get(commands[i][2]-1);
        }

        return answer;
    }
}