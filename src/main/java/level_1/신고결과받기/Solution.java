package level_1.신고결과받기;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> userMap = new HashMap();
        Map<String, Integer> userCallMap = new HashMap<>();

        for (String user : id_list) {
            userMap.put(user, new HashSet());
            userCallMap.put(user, 0);
        }

        String id, opponent;
        String[] data;
        for (String warn : report) {
            data = warn.split(" ");
            id = data[0];
            opponent = data[1];

            userMap.get(opponent).add(id);
        }

        userMap.forEach((key, warnSet) -> {
            if (warnSet.size() >= k)
                warnSet.forEach((user) -> {
                    userCallMap.put(
                            user, userCallMap.get(user)+1
                    );
                });
        });

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = userCallMap.get(id_list[i]);
        }

        return answer;
    }
}