package level_1.성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> scoreMap = new HashMap<>();

        int score; String type;
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 4) continue;

            // choices[i]: 5 ~ 7
            if (choices[i] >= 5)
                type = Character.toString(survey[i].charAt(1));
            // choices[i]: 1 ~ 3
            else
                type = Character.toString(survey[i].charAt(0));

            score = scoreMap.getOrDefault(type, 0);
            scoreMap.put(type, score + Math.abs(choices[i]-4));
        }

        // MBTI Logic
        String mbti = "";

        // _BTI
        if (scoreMap.getOrDefault("R", 0) >= scoreMap.getOrDefault("T", 0))
            mbti += "R";
        else mbti += "T";

        // M_TI
        if (scoreMap.getOrDefault("C", 0) >= scoreMap.getOrDefault("F", 0))
            mbti += "C";
        else mbti += "F";

        // MB_I
        if (scoreMap.getOrDefault("J", 0) >= scoreMap.getOrDefault("M", 0))
            mbti += "J";
        else mbti += "M";

        // MBT_
        if (scoreMap.getOrDefault("A", 0) >= scoreMap.getOrDefault("N", 0))
            mbti += "A";
        else mbti += "N";

        return mbti;
    }
}