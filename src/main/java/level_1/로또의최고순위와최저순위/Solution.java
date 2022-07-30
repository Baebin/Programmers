package level_1.로또의최고순위와최저순위;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};

        int zero = 0;
        int stack;

        List lottoList = new ArrayList();
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
            lottoList.add(lottos[i]);
        }
        for (int i : win_nums) {
            if (i == 0) continue;
            if (lottoList.contains(i)) lottoList.remove(Integer.valueOf(i));
        }

        stack = 6 - lottoList.size();
        answer = new int[]{getRank(stack + zero), getRank(stack)};

        return answer;
    }

    public int getRank(int num) {
        switch (num) {
            case 0:
            case 1:
                return 6;
            default:
                return 7 - num;
        }
    }
}