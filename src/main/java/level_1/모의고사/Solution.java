package level_1.모의고사;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] studnet_a = { 1, 2, 3, 4, 5 };
        int[] studnet_b = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] studnet_c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] students_num = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == studnet_a[i % studnet_a.length])
                students_num[0]++;
            if (answers[i] == studnet_b[i % studnet_b.length])
                students_num[1]++;
            if (answers[i] == studnet_c[i % studnet_c.length])
                students_num[2]++;
        }

        int max = Math.max(Math.max(students_num[0], students_num[1]), students_num[2]);
        List<Integer> answerList = new ArrayList<>(3);

        for (int i = 0; i < students_num.length; i++)
            if (max == students_num[i]) answerList.add(i+1);
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}