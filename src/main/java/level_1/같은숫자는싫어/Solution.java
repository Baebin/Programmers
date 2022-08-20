package level_1.같은숫자는싫어;

import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (!stack.isEmpty())
                if (stack.peek() == i) continue;
            stack.push(i);
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++)
            answer[i] = stack.get(i);
        return answer;
    }
}