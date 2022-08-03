package level_1.없는숫자더하기;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> intSet = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for (int i = 1; i <= 9; i++)
            if (!intSet.contains(i))
                answer += i;

        return answer;
    }
}