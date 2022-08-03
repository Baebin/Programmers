package level_1.실패율;

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        // ex, 5: { 0 ~ 6 }
        int[] user_stage = new int[N+2];
        int[] user_total = new int[N+1];

        Map<Integer, Double> rateMap = new HashMap<>(N+2);

        for (int stage : stages) user_stage[stage]++;

        user_total[N] = user_stage[N] + user_stage[N+1];
        for (int i = N-1; i >= 1; i--)
            user_total[i] = user_stage[i] + user_total[i+1];

        for (int i = 1; i <= N; i++)
            if (user_total[i] == 0) rateMap.put(i, 0d);
            else rateMap.put(i, (double) user_stage[i]/user_total[i]);

        // 실패율 기준 내림차순 정렬
        List<Integer> rateList = new ArrayList<>(rateMap.keySet());
        Collections.sort(rateList, ((o1, o2) -> Double.compare(rateMap.get(o2), rateMap.get(o1))));

        for (int i = 0; i < rateList.size(); i++) answer[i] = rateList.get(i);
        return answer;
    }
}